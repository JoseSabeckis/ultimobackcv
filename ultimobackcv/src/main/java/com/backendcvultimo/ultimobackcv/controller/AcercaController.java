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

import com.backendcvultimo.ultimobackcv.entity.acerca;
import com.backendcvultimo.ultimobackcv.interfaz.IAcercaService;
import com.backendcvultimo.ultimobackcv.response.Mensaje;

@RestController
@CrossOrigin(origins = "https://curriculumwebfloresjose.web.app", maxAge = 4200)
@RequestMapping("/api/test/acerca/")
public class AcercaController {

	@Autowired
	IAcercaService _Servicio;

	@GetMapping("traer")
	public ResponseEntity<List<acerca>> getAcercas() {

		List<acerca> list = _Servicio.getAcercas();

		return new ResponseEntity<List<acerca>>(list, HttpStatus.OK);

	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("crear")
	public ResponseEntity<?> crearAcerca(@RequestBody acerca acer) {
		_Servicio.saveAcerca(acer);
		return new ResponseEntity<>(new Mensaje("Acerca de Mi creado"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<?> borrarAcerca(@PathVariable("id") Long id) {
		_Servicio.deleteAcerca(id);
		return new ResponseEntity<>(new Mensaje("Eliminado"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("modificar/{id}")
	public ResponseEntity<?> modificarAcerca(@PathVariable("id") Long id, @RequestBody acerca acer) {

		acerca a = _Servicio.findByAcercaId(id);

		a.setDescripcion(acer.getDescripcion());

		_Servicio.saveAcerca(a);

		return new ResponseEntity<>(new Mensaje("Modificado"), HttpStatus.OK);

	}

	@GetMapping("traer/perfil")
	public ResponseEntity<acerca> buscarAcerca() {
		acerca a = _Servicio.findByAcercaId((long) 1);

		return new ResponseEntity<acerca>(a, HttpStatus.OK);
	}

}
