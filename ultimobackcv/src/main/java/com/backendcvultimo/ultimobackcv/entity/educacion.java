package com.backendcvultimo.ultimobackcv.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class educacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 1, max = 50, message = "no cumple la longitud")
	private String titulo;
	@NotNull
	@Size(min = 1, max = 50, message = "no cumple la longitud")
	private String years;
	@NotNull
	@Size(min = 1, max = 150, message = "no cumple la longitud")
	private String descripcion;
	
	public educacion(@NotNull @Size(min = 1, max = 50, message = "no cumple la longitud") String titulo,
			@NotNull @Size(min = 1, max = 50, message = "no cumple la longitud") String years,
			@NotNull @Size(min = 1, max = 150, message = "no cumple la longitud") String descripcion) {
		this.titulo = titulo;
		this.years = years;
		this.descripcion = descripcion;
	}

	public educacion() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
