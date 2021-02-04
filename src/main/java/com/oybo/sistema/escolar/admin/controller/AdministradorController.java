package com.oybo.sistema.escolar.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oybo.sistema.escolar.admin.bean.BeanAlumno;
import com.oybo.sistema.escolar.admin.bean.BeanRespuesta;
import com.oybo.sistema.escolar.admin.service.IAdministradorService;

@RestController
@RequestMapping("/admin")
public class AdministradorController {

	@Autowired
	private IAdministradorService adminService;
	
	@GetMapping(value = "/registroAlumno", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BeanRespuesta<String>> registroAlumno(BeanAlumno beanAlumno){
		BeanRespuesta<String> response = new BeanRespuesta<>();
		
		String mensaje = "El alumno no se registro correctamente."; 
		
		boolean result = adminService.registroAlumno(beanAlumno);
		
		if(result) {
			mensaje = "El alumno ha sido registrado satisfactoriamente.";
			
			response.setResponse(mensaje);
			response.setOk(true);
			response.setResponseCode("RESPUESTA_EXITOSA");
		}else {
			response.setResponse(mensaje);
			response.setOk(false);
			response.setResponseCode("RESPUESTA_ERRONEA");
		}
		
		BeanAlumno alumno = beanAlumno;

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
