package org.example;

public abstract class Bird extends Animal{
  abstract void eat();
  abstract void poop();
  //Fly behavior we want to exclude using
  //an interface similar to how we saw it in strategy design pattern
}
