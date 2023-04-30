package com.backendcvultimo.ultimobackcv.interfaz;

import java.util.List;

import com.backendcvultimo.ultimobackcv.entity.persona;

public interface IPersonaService {
	public List<persona> getPersonas();
	public void savePersona(persona people);
	public void deletePersona(Long id);
	public persona findByPersonaId(Long id);
}
