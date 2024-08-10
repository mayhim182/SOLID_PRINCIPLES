package org.example;

public abstract class Animal {
  private String species;
  private String name;
  private String pasandKaKhaana;

  public Animal() {
  }

  public Animal(String species, String name, String pasandKaKhaana) {
    this.species = species;
    this.name = name;
    this.pasandKaKhaana = pasandKaKhaana;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPasandKaKhaana() {
    return pasandKaKhaana;
  }

  public void setPasandKaKhaana(String pasandKaKhaana) {
    this.pasandKaKhaana = pasandKaKhaana;
  }
}
