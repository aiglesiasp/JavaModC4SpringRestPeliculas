/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.peliculas.service;

import java.util.List;

import com.aiglesiasp.javamodc4.springrest.peliculas.dto.Pelicula;

/**
 * @author aitor
 *
 */
public interface IPeliculaService {
	// Metodos del CRUD
	public List<Pelicula> listarPeliculas(); // Listar All

	public Pelicula guardarPelicula(Pelicula pelicula); // Guarda un pelicula CREATE

	public Pelicula peliculaById(int codigo); // Leer datos de un pelicula READ

	public Pelicula actualizarPelicula(Pelicula pelicula); // Actualiza datos del pelicula UPDATE

	public void eliminarPelicula(int codigo);// Elimina el pelicula DELETE
}
