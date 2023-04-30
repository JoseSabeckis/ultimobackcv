package com.backendcvultimo.ultimobackcv.implementacion;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendcvultimo.ultimobackcv.entity.educacion;
import com.backendcvultimo.ultimobackcv.interfaz.IEducacionService;
import com.backendcvultimo.ultimobackcv.repository.IEducacionRepository;

//NO SE ULTILIZA
@Service
@Transactional
public class ImpEducacionServicio implements IEducacionService{

	@Autowired IEducacionRepository _Repo;
	
	@Override
	public List<educacion> getEducacion() {
		// TODO Auto-generated method stub
		return _Repo.findAll();
	}

	@Override
	public void saveEducacion(educacion exp) {
		// TODO Auto-generated method stub
		_Repo.save(exp);
	}

	@Override
	public void eliminarEducacion(Long id) {
		// TODO Auto-generated method stub
		_Repo.deleteById(id);
	}

	@Override
	public educacion findByEducacion(Long id) {
		// TODO Auto-generated method stub
		return _Repo.findById(id).orElse(null);
	}

}
