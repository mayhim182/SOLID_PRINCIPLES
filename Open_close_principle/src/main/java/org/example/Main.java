package org.example;

import org.example.Exception.FlightLessBirdException;

public class Main {

  static Bird getBirdFromUser(String userSelection) {
    if(userSelection == "Sparrow") {
      Sparrow sparrow = new Sparrow();
      return sparrow;
    } else if(userSelection == "Kiwi") {
      Kiwi kiwi = new Kiwi();
      return kiwi;
    }
    return null;
  }

  public static void main(String[] args) throws FlightLessBirdException {
      Bird bird = getBirdFromUser("Kiwi");
      bird.fly();
  }
}
