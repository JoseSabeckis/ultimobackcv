package com.backendcvultimo.ultimobackcv.interfaz;

import java.util.List;

import com.backendcvultimo.ultimobackcv.entity.hys;

public interface IHysService {
	public List<hys> getHyss();
	public void saveHys(hys hys);
	public void deleteHys(Long id);
	public hys findByHysId(Long id);
}
