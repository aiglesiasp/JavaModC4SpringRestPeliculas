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

import com.aiglesiasp.javamodc4.springrest.peliculas.dto.Pelicula;
import com.aiglesiasp.javamodc4.springrest.peliculas.service.PeliculaServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula peliculaById(@PathVariable(name="codigo") int codigo) {
		Pelicula pelicula= new Pelicula();
		pelicula=peliculaServiceImpl.peliculaById(codigo);
		return pelicula;
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarPelicula(@PathVariable(name="codigo")int codigo,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionado= new Pelicula();
		Pelicula pelicula_actualizado= new Pelicula();
		pelicula_seleccionado= peliculaServiceImpl.peliculaById(codigo);
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		pelicula_actualizado = peliculaServiceImpl.actualizarPelicula(pelicula_seleccionado);
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name="codigo")int codigo) {
		peliculaServiceImpl.eliminarPelicula(codigo);
	}

}
