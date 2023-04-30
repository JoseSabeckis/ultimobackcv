package com.backendcvultimo.ultimobackcv.interfaz;

import java.util.List;

import com.backendcvultimo.ultimobackcv.entity.acerca;

public interface IAcercaService {
	public List<acerca> getAcercas();
	public void saveAcerca(acerca acer);
	public void deleteAcerca(Long id);
	public acerca findByAcercaId(Long id);
}
