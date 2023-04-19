/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.peliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.springrest.peliculas.dao.IPeliculaDAO;
import com.aiglesiasp.javamodc4.springrest.peliculas.dto.Pelicula;

/**
 * @author aitor
 *
 */
@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	IPeliculaDAO iDepartamentoDAO;

	@Override
	public List<Pelicula> listarPeliculas() {
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return iDepartamentoDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaById(int codigo) {
		return iDepartamentoDAO.findById(codigo).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return iDepartamentoDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int codigo) {
		iDepartamentoDAO.deleteById(codigo);

	}

}
