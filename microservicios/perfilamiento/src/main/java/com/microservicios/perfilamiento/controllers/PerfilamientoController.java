package com.microservicios.perfilamiento.controllers;

import com.microservicios.perfilamiento.models.entities.Perfilamiento;
import com.microservicios.perfilamiento.services.PerfilamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = { "*" })
@RestController
public class PerfilamientoController {

   @Autowired
   private PerfilamientoService service;

   @GetMapping(path = "/findAll")
   public ResponseEntity<?> findAll() {
      return ResponseEntity.ok().body(service.findAll());
   }

   @PostMapping(path = "/save")
   public ResponseEntity<?> save(@RequestBody Perfilamiento perfilamiento) {
      return ResponseEntity.status(HttpStatus.CREATED).body(service.save(perfilamiento));
   }
}