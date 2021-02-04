package com.oybo.sistema.escolar.admin.bean;

import java.io.Serializable;

public class BeanAlumno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 51788536447647260L;
	
	protected String matricula;
	protected String nombreCompleto;
	protected String apellidoPaterno;
	protected String apellidoMaterno;
	protected String fecNacimiento;
	protected String telefono;
	protected int grado;
	protected BeanCarrera beanCarrera;
	protected boolean estatus;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getFecNacimiento() {
		return fecNacimiento;
	}
	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	public BeanCarrera getBeanCarrera() {
		return beanCarrera;
	}
	public void setBeanCarrera(BeanCarrera beanCarrera) {
		this.beanCarrera = beanCarrera;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "BeanAlumno [matricula=" + matricula + ", nombreCompleto=" + nombreCompleto + ", apellidoPaterno="
				+ apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", fecNacimiento=" + fecNacimiento
				+ ", telefono=" + telefono + ", grado=" + grado + ", beanCarrera=" + beanCarrera + ", estatus="
				+ estatus + "]";
	}
	
	
	
}
