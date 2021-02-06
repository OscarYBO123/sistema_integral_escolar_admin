package com.oybo.sistema.escolar.admin.DAO;

import java.util.List;

import com.oybo.sistema.escolar.admin.bean.BeanAlumno;

public interface IAdministradorDAO {

	boolean registroAlumno(BeanAlumno beanAlumno);
	
	BeanAlumno obtenerAlumno(BeanAlumno beanAlumno);
}
