package com.backendcvultimo.ultimobackcv.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class persona {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	@NotNull
	@Size(min = 1, max = 50, message = "no cumple la longitud")
    private String nombre;
	@NotNull
	@Size(min = 1, max = 50, message = "no cumple la longitud")
    private String apellido;
	@Size(min = 1, max = 50, message = "no cumple la longitud")
	private String titulo;
    private String img;
	
	public persona(Long id, @NotNull @Size(min = 1, max = 50, message = "no cumple la longitud") String nombre,
			@NotNull @Size(min = 1, max = 50, message = "no cumple la longitud") String apellido,
			@Size(min = 1, max = 50, message = "no cumple la longitud") String titulo,
			@Size(min = 1, max = 50, message = "no cumple la longitud") String img) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulo = titulo;
		this.img = img;
	}

	public persona() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
