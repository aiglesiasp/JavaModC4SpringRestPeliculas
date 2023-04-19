package com.aiglesiasp.javamodc4.springrest.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.springrest.peliculas.dto.Sala;

public interface ISalaDAO extends JpaRepository<Sala, Integer> {

}
