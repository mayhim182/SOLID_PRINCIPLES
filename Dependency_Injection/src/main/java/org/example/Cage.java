package org.example;

import java.util.List;

public class Cage {
  IBowl iBowl;
  IDoor iDoor;

  List<String> residents;

  public Cage(IBowl iBowl, IDoor iDoor) {
    this.iBowl = iBowl;
    this.iDoor = iDoor;
  }

  public void resistAttack(Attack attack) {

  }
}
