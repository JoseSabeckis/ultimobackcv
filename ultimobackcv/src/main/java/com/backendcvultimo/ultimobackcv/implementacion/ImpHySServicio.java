package com.backendcvultimo.ultimobackcv.implementacion;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendcvultimo.ultimobackcv.entity.hys;
import com.backendcvultimo.ultimobackcv.interfaz.IHysService;
import com.backendcvultimo.ultimobackcv.repository.IHySRepository;

@Service
@Transactional
public class ImpHySServicio implements IHysService{
	
	@Autowired IHySRepository _Repo;
	
	@Override
	public List<hys> getHyss() {
		// TODO Auto-generated method stub
		return _Repo.findAll();
	}

	@Override
	public void saveHys(hys hys) {
		// TODO Auto-generated method stub
		_Repo.save(hys);
	}

	@Override
	public void deleteHys(Long id) {
		// TODO Auto-generated method stub
		_Repo.deleteById(id);
	}

	@Override
	public hys findByHysId(Long id) {
		// TODO Auto-generated method stub
		return _Repo.findById(id).orElse(null);
	}
	
}
