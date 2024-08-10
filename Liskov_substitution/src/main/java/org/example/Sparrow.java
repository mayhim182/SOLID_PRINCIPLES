package org.example;

public class Sparrow extends Bird implements Fly{
  @Override
  void eat() {
    System.out.println("chu chu karti aayi chidiya");
  }

  @Override
  void poop() {
    System.out.println("Uhhhh");
  }

  @Override
  public void fly() {
    System.out.println("I fly 🥲");
  }
}
