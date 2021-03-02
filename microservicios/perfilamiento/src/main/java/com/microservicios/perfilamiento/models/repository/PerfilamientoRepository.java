package com.microservicios.perfilamiento.models.repository;

import com.microservicios.perfilamiento.models.entities.Perfilamiento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilamientoRepository extends JpaRepository<Perfilamiento, Long> {

}
