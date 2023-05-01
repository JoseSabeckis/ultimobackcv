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
import com.backendcvultimo.ultimobackcv.entity.experiencia;
import com.backendcvultimo.ultimobackcv.interfaz.IExperienciaService;
import com.backendcvultimo.ultimobackcv.response.Mensaje;

@RestController
@CrossOrigin(origins = "https://curriculumwebfloresjose.web.app", maxAge = 4200)
@RequestMapping("/api/test/experiencia/")
public class ExperienciaController {

	@Autowired
	IExperienciaService _Servicio;

	@GetMapping("traer")
	public ResponseEntity<List<experiencia>> getExperiencias() {
		List<experiencia> list = _Servicio.getExperiencias();

		return new ResponseEntity<List<experiencia>>(list, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("crear")
	public ResponseEntity<?> crearExperiencia(@RequestBody experiencia exp) {
		/*
		if(StringUtils.isBlank(exp.getTitulo())) {
			return new ResponseEntity<>(new Mensaje("titulo obligatorio"),HttpStatus.BAD_REQUEST);
		}
		
		if(_Servicio.existByTitulo(exp.getTitulo())) {
			return new ResponseEntity<>(new Mensaje("ese titulo ya existe"),HttpStatus.BAD_REQUEST);
		}
		*/
		_Servicio.saveExperiencia(exp);

		return new ResponseEntity<>(new Mensaje("Creada Experiencia"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<?> eliminarExperiencia(@PathVariable("id") Long id) {
		_Servicio.eliminarExperiencia(id);

		return new ResponseEntity<>(new Mensaje("Experiencia Eliminado"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("modificar/{id}")
	public ResponseEntity<?> modificarExperiencia(@PathVariable("id") Long id, @RequestBody experiencia exp) {
		/*
		if(!_Servicio.existById(exp.getId())) {
			return new ResponseEntity<>(new Mensaje("no existe este id"),HttpStatus.BAD_REQUEST);
		}
		if(StringUtils.isBlank(exp.getTitulo())) {
			return new ResponseEntity<>(new Mensaje("titulo obligatorio"),HttpStatus.BAD_REQUEST);
		}		
		if(_Servicio.existByTitulo(exp.getTitulo()) && _Repo.getById(exp.getTitulo()).get().getId != id ) {
			return new ResponseEntity<>(new Mensaje("ese titulo ya existe"),HttpStatus.BAD_REQUEST);
		}*/
		
		experiencia e = _Servicio.findByExperiencias(id);

		e.setDescripcion(exp.getDescripcion());
		e.setTitulo(exp.getTitulo());
		e.setYears(exp.getYears());

		_Servicio.saveExperiencia(e);

		return new ResponseEntity<>(new Mensaje("Exp Modificado"), HttpStatus.OK);

	}

	@GetMapping("traer/{id}")
	public ResponseEntity<experiencia> buscarExperiencia(@PathVariable("id") Long id) {
		experiencia exp = _Servicio.findByExperiencias(id);

		return new ResponseEntity<experiencia>(exp, HttpStatus.OK);
	}

}
