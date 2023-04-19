/**
 * 
 */
package com.aiglesiasp.javamodc4.springrest.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aiglesiasp.javamodc4.springrest.peliculas.dto.Pelicula;

/**
 * @author aitor
 *
 */
public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer> {

}
