package com.oybo.sistema.escolar.admin.service;

import java.util.List;

import com.oybo.sistema.escolar.admin.bean.BeanAlumno;

public interface IAdministradorService {
	boolean registroAlumno(BeanAlumno beanAlumno);
	
	BeanAlumno obtenerAlumno(BeanAlumno beanAlumno);
	
	List<BeanAlumno> obtenerAlumnos(BeanAlumno beanAlumno);
}
