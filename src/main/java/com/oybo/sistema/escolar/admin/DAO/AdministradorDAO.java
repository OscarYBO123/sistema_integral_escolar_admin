package com.oybo.sistema.escolar.admin.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oybo.sistema.escolar.admin.Utils.AlumnoMapper;
import com.oybo.sistema.escolar.admin.bean.BeanAlumno;

/**
 * 
 * @author oscar
 *
 */
//Se agrega la anotacion Repository en DAO
@Repository
public class AdministradorDAO implements IAdministradorDAO {

	private static final String QUERY_INSERT = "INSERT INTO alumno (matricula, nombreCompleto, apellidoPaterno, apellidoMaterno, fecNacimiento, grado, idCarrera, estatus, fecRegistro, fecActualizacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, sysdate(), sysdate())";
	
	private static final String QUERY_SELECT_ALUMNO = "SELECT A.MATRICULA, A.NOMBRECOMPLETO, A.APELLIDOPATERNO, A.APELLIDOMATERNO, A.FECNACIMIENTO, A.TELEFONO, A.GRADO, C.NOMBRECARRERA, A.ESTATUS FROM ALUMNO AS A INNER JOIN CARRERA AS C ON A.IDCARRERA = C.IDCARRERA WHERE A.MATRICULA = ? ";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean registroAlumno(BeanAlumno beanAlumno) {
		
		int resultado = 0;
		
		Object[] parametros = {
				beanAlumno.getMatricula(),
				beanAlumno.getNombreCompleto(),
				beanAlumno.getApellidoPaterno(),
				beanAlumno.getApellidoMaterno(),
				beanAlumno.getFecNacimiento(),
				beanAlumno.getTelefono(),
				beanAlumno.getGrado(),
				beanAlumno.getBeanCarrera().getIdCarrera(),
				beanAlumno.isEstatus()
		};
		
		resultado = jdbcTemplate.update(QUERY_INSERT, parametros);
		
		if(resultado == 1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public BeanAlumno obtenerAlumno(BeanAlumno beanAlumno) {
		BeanAlumno alumno = new BeanAlumno();
		
		Object[] parametros = {
				beanAlumno.getMatricula()
				};
		try {
			alumno = jdbcTemplate.queryForObject(QUERY_SELECT_ALUMNO, parametros, new AlumnoMapper());
		}catch (Exception e) {
			return null;
		}
		
		return alumno;
	}

}
