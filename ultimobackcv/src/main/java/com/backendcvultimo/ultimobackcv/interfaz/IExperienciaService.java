package com.backendcvultimo.ultimobackcv.interfaz;

import java.util.List;

import com.backendcvultimo.ultimobackcv.entity.experiencia;

public interface IExperienciaService {
	public List<experiencia> getExperiencias();
	public void saveExperiencia(experiencia exp);
	public void eliminarExperiencia(Long id);
	public experiencia findByExperiencias(Long id);
	//Optional<experiencia> findByTitulo(String titulo);
	//public boolean existByTitulo(String titulo);
	//public boolean existById(Long id);
}
