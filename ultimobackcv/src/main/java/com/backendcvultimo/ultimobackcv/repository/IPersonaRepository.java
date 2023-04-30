package com.backendcvultimo.ultimobackcv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendcvultimo.ultimobackcv.entity.persona;

@Repository
public interface IPersonaRepository extends JpaRepository<persona, Long>{
	//public Optional<persona> findByNombre(String nombre);
	//public boolean existByNombre(String nombre);
}
