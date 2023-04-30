package com.backendcvultimo.ultimobackcv.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendcvultimo.ultimobackcv.repository.IEducacionRepository;


@Service
@Transactional
public class EducationService {
	@Autowired
	IEducacionRepository _Repo;
	/*
	public List<educacion> list(){
		return _Repo.findAll();
	}
	
	public Optional<educacion> getByIdEdu(Long id){
		return _Repo.findById(id);
	}
	
	public Optional<educacion> getByEduName(String titulo){
		return _Repo.findByTitulo(titulo);
	}
	
	public void saveEdu(educacion edu) {
		_Repo.save(edu);
	}
	
	public void deleteEdu(Long id) {
		_Repo.deleteById(id);
	}
	
	public boolean existByIdEdu(Long id) {
		return _Repo.existsById(id);
	}
	
	public boolean existByNameEdu(String titulo) {
		return _Repo.existByTitulo(titulo);
	}*/
}
