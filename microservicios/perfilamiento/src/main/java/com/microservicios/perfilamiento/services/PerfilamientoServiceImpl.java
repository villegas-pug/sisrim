package com.microservicios.perfilamiento.services;

import com.microservicios.perfilamiento.models.entities.Perfilamiento;
import com.microservicios.perfilamiento.models.repository.PerfilamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PerfilamientoServiceImpl implements PerfilamientoService {

   @Autowired
   private PerfilamientoRepository repository;

   @Override
   @Transactional(readOnly = true)
   public Iterable<Perfilamiento> findAll() {
      return repository.findAll();
   }

   @Override
   @Transactional
   public Perfilamiento save(Perfilamiento perfilamiento) {
      return repository.save(perfilamiento);
   }

   @Override
   @Transactional(readOnly = true)
   public boolean existsById(Long id) {
      return repository.existsById(id);
   }

}
