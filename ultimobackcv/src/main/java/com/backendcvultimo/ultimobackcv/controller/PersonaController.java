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

import com.backendcvultimo.ultimobackcv.entity.persona;
import com.backendcvultimo.ultimobackcv.interfaz.IPersonaService;
import com.backendcvultimo.ultimobackcv.response.Mensaje;

@RestController
@CrossOrigin(origins = "https://curriculumwebfloresjose.web.app/ultimobackcv-production.up.railway.app", maxAge = 4200)
@RequestMapping("/api/test/personas/")
public class PersonaController {

	@Autowired
	IPersonaService _Service;

	@GetMapping("traer")
	public ResponseEntity<List<persona>> getPersona() {
		List<persona> list = _Service.getPersonas();
		return new ResponseEntity<List<persona>>(list, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("crear")
	public ResponseEntity<?> crearPersonas(@RequestBody persona people) {
		_Service.savePersona(people);
		return new ResponseEntity<>(new Mensaje("Persona Creada"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<?> borrarPersona(@PathVariable("id") Long id) {
		_Service.deletePersona(id);
		return new ResponseEntity<>(new Mensaje("Persona Eliminada"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("modificar/{id}")
	public ResponseEntity<?> modificarPersona(@PathVariable("id") Long id, @RequestBody persona p) {
		
		persona people = _Service.findByPersonaId(id);

		people.setNombre(p.getNombre());
		people.setApellido(p.getApellido());
		people.setImg(p.getImg());
		people.setTitulo(p.getTitulo());

		_Service.savePersona(people);

		return new ResponseEntity<>(new Mensaje("Persona Actualizada"), HttpStatus.OK);

	}

	@GetMapping("traer/perfil")
	public ResponseEntity<persona> buscarPersona() {
		persona p = _Service.findByPersonaId((long) 1);

		return new ResponseEntity<persona>(p, HttpStatus.OK);
	}

}
