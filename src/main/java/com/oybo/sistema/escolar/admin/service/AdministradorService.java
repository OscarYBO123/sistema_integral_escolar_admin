package com.oybo.sistema.escolar.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oybo.sistema.escolar.admin.DAO.IAdministradorDAO;
import com.oybo.sistema.escolar.admin.bean.BeanAlumno;
/**
 * 
 * @author oscar
 *
 */
//Se agrega la anotacion service en el Service
@Service
public class AdministradorService implements IAdministradorService{
	
	@Autowired
	private IAdministradorDAO adminDAO;

	@Override
	public boolean registroAlumno(BeanAlumno beanAlumno) {
		boolean respuesta = false;
		
		respuesta = adminDAO.registroAlumno(beanAlumno);
		
		return respuesta;
	}

	@Override
	public BeanAlumno obtenerAlumno(BeanAlumno beanAlumno) {
		BeanAlumno alumno = new BeanAlumno();
		alumno = adminDAO.obtenerAlumno(beanAlumno);
		return alumno;
	}

}
