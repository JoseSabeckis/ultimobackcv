package com.backendcvultimo.ultimobackcv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendcvultimo.ultimobackcv.entity.acerca;

@Repository
public interface IAcercaRepository extends JpaRepository<acerca, Long>{

}
