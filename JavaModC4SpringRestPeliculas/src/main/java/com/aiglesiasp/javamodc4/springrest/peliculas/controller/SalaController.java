/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiasp.javamodc4.springrest.peliculas.dto.Sala;
import com.aiglesiasp.javamodc4.springrest.peliculas.service.SalaServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;;

	@GetMapping("/salas")
	public List<Sala> listarSalas() {
		return salaServiceImpl.listarSalas();
	}

	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		return salaServiceImpl.guardarSala(sala);
	}

	@GetMapping("/salas/{codigo}")
	public Sala salaById(@PathVariable(name = "codigo") int codigo) {
		Sala sala = new Sala();
		sala = salaServiceImpl.empleadoById(codigo);
		return sala;
	}

	@PutMapping("/salas/{codigo}")
	public Sala actualizarSala(@PathVariable(name = "codigo") int codigo, @RequestBody Sala sala) {

		Sala sala_seleccionada = new Sala();
		Sala sala_actualizada = new Sala();
		sala_seleccionada = salaServiceImpl.empleadoById(codigo);
		sala_seleccionada.setCodigo(sala.getCodigo());
		sala_seleccionada.setNombre(sala.getNombre());
		sala_seleccionada.setPelicula(sala.getPelicula());

		sala_actualizada = salaServiceImpl.actualizarSala(sala_seleccionada);
		return sala_actualizada;
	}

	@DeleteMapping("/salas/{codigo}")
	public void eliminarSala(@PathVariable(name = "codigo") int codigo) {
		salaServiceImpl.eliminarSala(codigo);
	}

}
