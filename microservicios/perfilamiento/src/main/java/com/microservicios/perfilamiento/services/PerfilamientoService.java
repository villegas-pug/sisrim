package com.microservicios.perfilamiento.services;

import com.microservicios.perfilamiento.models.entities.Perfilamiento;

public interface PerfilamientoService {
   Iterable<Perfilamiento> findAll();

   Perfilamiento save(Perfilamiento perfilamiento);

   boolean existsById(Long id);
}
