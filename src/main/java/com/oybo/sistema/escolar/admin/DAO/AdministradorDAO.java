package com.oybo.sistema.escolar.admin.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

}
