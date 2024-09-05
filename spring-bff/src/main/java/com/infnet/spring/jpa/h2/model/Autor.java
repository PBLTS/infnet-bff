package com.infnet.spring.jpa.h2.model;




public class Autor {

 
  private long id;

  private String nome;

  private String description;


  public Autor() {

  }

  public Autor(String nome, String description) {
    this.nome = nome;
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public String toString() {
    return "Autor [id=" + id + ", nome=" + nome + ", desc=" + description +  "]";
  }

}
