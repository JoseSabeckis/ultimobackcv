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

import com.backendcvultimo.ultimobackcv.entity.educacion;
import com.backendcvultimo.ultimobackcv.interfaz.IEducacionService;
import com.backendcvultimo.ultimobackcv.response.Mensaje;
//import com.backendcvultimo.ultimobackcv.service.EducationService;----

@RestController
@CrossOrigin(origins = "https://curriculumwebfloresjose.web.app/ultimobackcv-production.up.railway.app", maxAge = 4200)
@RequestMapping("/api/test/educacion/")
public class EducacionController {
	
	@Autowired
	IEducacionService _Servicio;
	
	@GetMapping("traer")
	public ResponseEntity<List<educacion>> getEducaciones() {
		List<educacion> list = _Servicio.getEducacion();

		return new ResponseEntity<List<educacion>>(list, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("crear")
	public ResponseEntity<?> crearEducacion(@RequestBody educacion edu) {
		
		/*
		if(StringUtils.isBlank(edu.getTitulo())) {
			return new ResponseEntity<>(new Mensaje("titulo necesario"), HttpStatus.OK);
		}
		
		if(_Servicio.existByNameEdu(edu.getTitulo())) {
			return new ResponseEntity<>(new Mensaje("titulo ya existe"), HttpStatus.NOT_FOUND);
		}*/
		
		_Servicio.saveEducacion(edu);

		return new ResponseEntity<>(new Mensaje("Creada Educacion"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<?> eliminarEducacion(@PathVariable("id") Long id) {
		/*
		if(!_Servicio.existByIdEdu(id)) {
			return new ResponseEntity<>(new Mensaje("Id no encontrado"), HttpStatus.NOT_FOUND);
		}*/
		_Servicio.eliminarEducacion(id);

		return new ResponseEntity<>(new Mensaje("Educacion Eliminada"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("modificar/{id}")
	public ResponseEntity<?> modificarEducacion(@PathVariable("id") Long id, @RequestBody educacion edu) {
		/*
		if(!_Servicio.existByIdEdu(id)) {
			return new ResponseEntity<>(new Mensaje("Id no encontrado"), HttpStatus.NOT_FOUND);
		}
		
		if(_Servicio.existByNameEdu(edu.getTitulo()) && _Servicio.getByEduName(edu.getTitulo()).get().getId() != id) {
			return new ResponseEntity<>(new Mensaje("titulo ya existe"), HttpStatus.NOT_FOUND);
		}*/
		
		educacion e = _Servicio.findByEducacion(id);

		e.setDescripcion(edu.getDescripcion());
		e.setTitulo(edu.getTitulo());
		e.setYears(edu.getYears());

		_Servicio.saveEducacion(e);

		return new ResponseEntity<>(new Mensaje("Edu Modificada"), HttpStatus.OK);

	}

	//@PreAuthorize("hasRole('ADMIN')")//-----------------------------------------
	@GetMapping("traer/{id}")
	public ResponseEntity<educacion> buscarEducacion(@PathVariable("id") Long id) {
		/*
		if(!_Servicio.existByIdEdu(id)) {
			return new ResponseEntity(new Mensaje("Id no encontrado"), HttpStatus.BAD_REQUEST);
		}*/
		
		educacion exp = _Servicio.findByEducacion(id);

		return new ResponseEntity<educacion>(exp, HttpStatus.OK);
	}
	
}
