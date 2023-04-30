package com.backendcvultimo.ultimobackcv.implementacion;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendcvultimo.ultimobackcv.entity.experiencia;
import com.backendcvultimo.ultimobackcv.interfaz.IExperienciaService;
import com.backendcvultimo.ultimobackcv.repository.IExperienciaRepository;

@Service
@Transactional
public class ImpExperienciaServicio implements IExperienciaService {

	@Autowired
	IExperienciaRepository _Repo;

	@Override
	public List<experiencia> getExperiencias() {
		// TODO Auto-generated method stub
		return _Repo.findAll();
	}

	@Override
	public void saveExperiencia(experiencia exp) {
		// TODO Auto-generated method stub
		_Repo.save(exp);
	}

	@Override
	public void eliminarExperiencia(Long id) {
		// TODO Auto-generated method stub
		_Repo.deleteById(id);
	}

	@Override
	public experiencia findByExperiencias(Long id) {
		// TODO Auto-generated method stub
		return _Repo.findById(id).orElse(null);
	}

}
