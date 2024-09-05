package com.infnet.spring.jpa.h2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infnet.spring.jpa.h2.dto.LivrosDTO;
import com.infnet.spring.jpa.h2.model.Autor;
import com.infnet.spring.jpa.h2.service.LivrariaService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class LivrariaController { 

  @Autowired
  LivrariaService livrariaService;

  @GetMapping("/livro-autor")
  public ResponseEntity<List<LivrosDTO>> getAll(@RequestParam(required = false) String title) {
    try {
      List<LivrosDTO> livros = new ArrayList<LivrosDTO>();

      if (title == null)
      livrariaService.getAll(title).forEach(livros::add);

      if (livros.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(livros, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  //@GetMapping("/livro-autor/{id}")
  //public ResponseEntity<Autor> getAutorlById(@PathVariable("id") long id) {
    //Optional<Autor> AutorId = livrariaService.findById(id);

   // if (AutorId.isPresent()) {
   //   return new ResponseEntity<>(AutorId.get(), HttpStatus.OK);
   // } else {
    //  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
   // }
  //}

  


}
