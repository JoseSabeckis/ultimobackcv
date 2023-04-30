package com.backendcvultimo.ultimobackcv.security.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendcvultimo.ultimobackcv.models.ERole;
import com.backendcvultimo.ultimobackcv.models.Role;
import com.backendcvultimo.ultimobackcv.repository.RoleRepository;

@Service
@Transactional
public class RolService {
	@Autowired RoleRepository _Repo;
	
	public Optional<Role> getByRolNombre(ERole rolNombre){
        return  _Repo.findByName(rolNombre);
    }

    public void save(Role rol){
    	_Repo.save(rol);
    }

}
