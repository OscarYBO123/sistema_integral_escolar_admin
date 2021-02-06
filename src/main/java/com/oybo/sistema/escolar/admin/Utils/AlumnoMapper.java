package com.oybo.sistema.escolar.admin.Utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.oybo.sistema.escolar.admin.bean.BeanAlumno;
import com.oybo.sistema.escolar.admin.bean.BeanCarrera;

public class AlumnoMapper implements RowMapper<BeanAlumno>{

	@Override
	public BeanAlumno mapRow(ResultSet rs, int rowNum) throws SQLException {
		BeanAlumno beanAlumno = new BeanAlumno();
		
		beanAlumno.setMatricula(rs.getString("MATRICULA"));
		beanAlumno.setNombreCompleto(rs.getString("NOMBRECOMPLETO"));
		beanAlumno.setApellidoPaterno(rs.getString("APELLIDOPATERNO"));
		beanAlumno.setApellidoMaterno(rs.getString("APELLIDOMATERNO"));
		beanAlumno.setFecNacimiento(rs.getString("FECNACIMIENTO"));
		beanAlumno.setTelefono(rs.getString("TELEFONO"));
		beanAlumno.setGrado(rs.getInt("GRADO"));
		
		BeanCarrera beanCarrera = new BeanCarrera();
		beanCarrera.setNombreCarrera(rs.getString("NOMBRECARRERA"));
		
		beanAlumno.setBeanCarrera(beanCarrera);
		beanAlumno.setEstatus(rs.getBoolean("ESTATUS"));
		
		return beanAlumno;
	}

}
