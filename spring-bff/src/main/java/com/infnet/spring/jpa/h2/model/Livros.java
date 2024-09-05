package com.infnet.spring.jpa.h2.model;




public class Livros {

  private long id;

  private String title;

  private String description;

  private boolean published;



  public Livros() {

  }

  public Livros(String title, String description, boolean published) {
    this.title = title;
    this.description = description;
    this.published = published;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  @Override
  public String toString() {
    return "Livros [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
  }

}
