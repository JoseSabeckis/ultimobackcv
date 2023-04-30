package com.backendcvultimo.ultimobackcv.implementacion;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendcvultimo.ultimobackcv.entity.persona;
import com.backendcvultimo.ultimobackcv.interfaz.IPersonaService;
import com.backendcvultimo.ultimobackcv.repository.IPersonaRepository;

@Service
@Transactional
public class ImpPersonaServicio implements IPersonaService{

	@Autowired
	IPersonaRepository _Repo;

	@Override
	public List<persona> getPersonas() {
		// TODO Auto-generated method stub
		return _Repo.findAll();
	}

	@Override
	public void savePersona(persona people) {
		// TODO Auto-generated method stub
		_Repo.save(people);
	}

	@Override
	public void deletePersona(Long id) {
		// TODO Auto-generated method stub
		_Repo.deleteById(id);
	}

	@Override
	public persona findByPersonaId(Long id) {
		// TODO Auto-generated method stub
		return _Repo.findById(id).orElse(null);
	}

}
