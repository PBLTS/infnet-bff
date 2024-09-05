package com.infnet.spring.jpa.h2.dto;

import com.infnet.spring.jpa.h2.model.Autor;
import com.infnet.spring.jpa.h2.model.Livros;



public class LivrosDTO {



  private Livros livro;

  private Autor autor;

  private String MsgRetorno;

  public Livros getLivro() {
    return livro;
  }

  public void setLivros(Livros livro) {
    this.livro = livro;
  }

  public Autor getAutor() {
    return autor;
  }

  public void setAutor(Autor autor) {
    this.autor = autor;
  }

  



}
