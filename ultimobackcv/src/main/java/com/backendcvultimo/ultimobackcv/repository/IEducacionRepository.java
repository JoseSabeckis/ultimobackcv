package com.backendcvultimo.ultimobackcv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendcvultimo.ultimobackcv.entity.educacion;

@Repository
public interface IEducacionRepository extends JpaRepository<educacion, Long>{
	//public Optional<educacion> findByTitulo(String titulo);
	//public boolean existByTitulo(String titulo);
}
