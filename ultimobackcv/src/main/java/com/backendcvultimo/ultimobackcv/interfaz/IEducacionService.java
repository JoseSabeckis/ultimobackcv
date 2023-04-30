package com.backendcvultimo.ultimobackcv.interfaz;

import java.util.List;

import com.backendcvultimo.ultimobackcv.entity.educacion;

public interface IEducacionService {
	public List<educacion> getEducacion();
	public void saveEducacion(educacion exp);
	public void eliminarEducacion(Long id);
	public educacion findByEducacion(Long id);
}
