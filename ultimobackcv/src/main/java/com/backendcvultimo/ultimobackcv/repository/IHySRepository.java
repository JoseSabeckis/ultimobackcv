package com.backendcvultimo.ultimobackcv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendcvultimo.ultimobackcv.entity.hys;

@Repository
public interface IHySRepository extends JpaRepository<hys, Long>{
	
}
