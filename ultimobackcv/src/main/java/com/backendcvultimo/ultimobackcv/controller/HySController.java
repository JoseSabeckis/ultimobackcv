package com.backendcvultimo.ultimobackcv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendcvultimo.ultimobackcv.entity.hys;
import com.backendcvultimo.ultimobackcv.interfaz.IHysService;
import com.backendcvultimo.ultimobackcv.response.Mensaje;

@RestController
@CrossOrigin(origins = "*/ultimobackcv-production.up.railway.app", maxAge = 4200)
@RequestMapping("/api/test/hys/")
public class HySController {
	
	@Autowired IHysService _Servicio;
	
	@GetMapping("traer")
	public ResponseEntity<List<hys>> getHyss() {
		List<hys> list = _Servicio.getHyss();

		return new ResponseEntity<List<hys>>(list, HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("crear")
	public ResponseEntity<?> crearHys(@RequestBody hys hys) {
		
		_Servicio.saveHys(hys);

		return new ResponseEntity<>(new Mensaje("Creada Hys"), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<?> eliminarHys(@PathVariable("id") Long id) {
		
		_Servicio.deleteHys(id);

		return new ResponseEntity<>(new Mensaje("Hys Eliminada"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("modificar/{id}")
	public ResponseEntity<?> modificarHys(@PathVariable("id") Long id, @RequestBody hys hys) {
		
		hys e = _Servicio.findByHysId(id);

		e.setNombre(hys.getNombre());
		e.setPorcentaje(hys.getPorcentaje());

		_Servicio.saveHys(e);

		return new ResponseEntity<>(new Mensaje("Hys Modificada"), HttpStatus.OK);

	}

	@GetMapping("traer/{id}")
	public ResponseEntity<hys> buscarHys(@PathVariable("id") Long id) {
		
		hys h = _Servicio.findByHysId(id);

		return new ResponseEntity<hys>(h, HttpStatus.OK);
	}
	
}
