package com.oybo.sistema.escolar.admin.bean;

import java.io.Serializable;

public class BeanCarrera implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2532113654702358317L;

	protected int idCarrera;
	protected String nombreCarrera;
	
	public int getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	@Override
	public String toString() {
		return "BeanCarrera [idCarrera=" + idCarrera + ", nombreCarrera=" + nombreCarrera + "]";
	}
	
}
