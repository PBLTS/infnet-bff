package com.infnet.spring.jpa.h2.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infnet.spring.jpa.h2.dto.LivrosDTO;
import com.infnet.spring.jpa.h2.model.Autor;
import com.infnet.spring.jpa.h2.model.Livros;

@Service
public class LivrariaService {


    @Autowired
    RestTemplate restTemplate;

    final String ROOT_URI_AUTOR = "http://localhost:8081/api/autor";

    final String ROOT_URI_LIVRO = "http://localhost:8080/api/livro";


    public List<LivrosDTO> getAll(String title){

        List<LivrosDTO> livros = new ArrayList<LivrosDTO>();
        LivrosDTO livroDto = new LivrosDTO();

        try {

                ResponseEntity<Livros[]> responselivro = restTemplate.getForEntity(ROOT_URI_LIVRO, Livros[].class);

                for (Livros livro : responselivro.getBody()) {

                  livroDto.setLivros(livro);

                ResponseEntity<Autor> responseAutor = restTemplate.getForEntity(ROOT_URI_AUTOR, Autor.class);

                  livroDto.setAutor(responseAutor.getBody());

                }

                livros.add(livroDto);

            
        


    } catch (Exception e) {
      e.printStackTrace();;
    }
        return livros;

    }



}
