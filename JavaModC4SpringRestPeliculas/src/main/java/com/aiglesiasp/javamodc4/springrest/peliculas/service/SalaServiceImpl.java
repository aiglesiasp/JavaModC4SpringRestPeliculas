/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.peliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.springrest.peliculas.dao.ISalaDAO;
import com.aiglesiasp.javamodc4.springrest.peliculas.dto.Sala;

/**
 * @author aitor
 *
 */
@Service
public class SalaServiceImpl implements ISalaService{
	@Autowired
	ISalaDAO iEmpleadoDAO;

	@Override
	public List<Sala> listarSalas() {
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return iEmpleadoDAO.save(sala);
	}

	@Override
	public Sala empleadoById(int codigo) {
		return iEmpleadoDAO.findById(codigo).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return iEmpleadoDAO.save(sala);
	}

	@Override
	public void eliminarSala(int codigo) {
		iEmpleadoDAO.deleteById(codigo);
		
	}

}
