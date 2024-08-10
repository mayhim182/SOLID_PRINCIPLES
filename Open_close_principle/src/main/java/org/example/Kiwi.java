package org.example;

import org.example.Exception.FlightLessBirdException;

public class Kiwi extends Bird{
  @Override
  void fly() throws FlightLessBirdException {
    throw new FlightLessBirdException();
  }
}
