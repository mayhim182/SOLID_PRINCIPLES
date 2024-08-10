package org.example;

import org.example.Exception.FlightLessBirdException;

public abstract class Bird extends Animal{

  public Bird() {

  }

  public Bird(String species, String name, String pasandKaKhaana) {
    super(species, name, pasandKaKhaana);
  }

  abstract void fly() throws FlightLessBirdException;
}
