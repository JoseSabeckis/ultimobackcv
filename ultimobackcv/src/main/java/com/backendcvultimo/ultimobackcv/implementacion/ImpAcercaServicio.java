package com.backendcvultimo.ultimobackcv.implementacion;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendcvultimo.ultimobackcv.entity.acerca;
import com.backendcvultimo.ultimobackcv.interfaz.IAcercaService;
import com.backendcvultimo.ultimobackcv.repository.IAcercaRepository;

@Service
@Transactional
public class ImpAcercaServicio implements IAcercaService{
	
	@Autowired IAcercaRepository _Repo;

	@Override
	public List<acerca> getAcercas() {
		// TODO Auto-generated method stub
		return _Repo.findAll();
	}

	@Override
	public void saveAcerca(acerca acer) {
		// TODO Auto-generated method stub
		_Repo.save(acer);
	}

	@Override
	public void deleteAcerca(Long id) {
		// TODO Auto-generated method stub
		_Repo.deleteById(id);
	}

	@Override
	public acerca findByAcercaId(Long id) {
		// TODO Auto-generated method stub
		return _Repo.findById(id).orElse(null);
	}

}
