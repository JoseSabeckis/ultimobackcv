package com.backendcvultimo.ultimobackcv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendcvultimo.ultimobackcv.entity.experiencia;

@Repository
public interface IExperienciaRepository extends JpaRepository<experiencia, Long>{
	//public Optional<experiencia> findByTitulo(String titulo);
	//public boolean existByTitulo(String titulo);
}
