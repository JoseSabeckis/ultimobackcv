package com.backendcvultimo.ultimobackcv.dto;

import javax.validation.constraints.NotBlank;

public class EducacionDto {
	@NotBlank
	private String titulo;
	private String years;
	@NotBlank
	private String descripcion;
	
	public EducacionDto(@NotBlank String titulo, String years, @NotBlank String descripcion) {
		this.titulo = titulo;
		this.years = years;
		this.descripcion = descripcion;
	}
	public EducacionDto() {
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
