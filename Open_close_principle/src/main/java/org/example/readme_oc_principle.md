```
  public abstract class Bird extends Animal{

  public Bird() {

  }

  public Bird(String species, String name, String pasandKaKhaana) {
    super(species, name, pasandKaKhaana);
  }

  abstract void fly();
}


```

The above code can be extended to different birds
without the need for changing the Bird class

``` so the inhertance is Animal <- Bird <- different birds with different fly behaviours. ```


But since if it is all good why do we need ```Liskov's Substitution Principle```

In the same example
1. Bird Kiwi cannot fly
2. Let's suppose we want to create an object of superclass using subclass
   and then we pass it to some method which makes all birds fly so this will cause error

```
public void makeBirdFly(Bird bird) {
    bird.fly();  // This will work for Sparrow and Eagle but fail conceptually for Penguin
}
// Usage
makeBirdFly(new Sparrow()); // Works fine
makeBirdFly(new Eagle());   // Works fine
makeBirdFly(new Penguin()); // Conceptually incorrect

```
