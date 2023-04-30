package com.backendcvultimo.ultimobackcv.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class acerca {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	//@Size(min = 1, max = 100, message = "no cumple la longitud")
	private String descripcion;
	
	public acerca() {
		// TODO Auto-generated constructor stub
	}

	public acerca(@NotNull @Size(min = 1, max = 100, message = "no cumple la longitud") String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
