public class Mammal extends Animal{
  private Integer numberOfLegs;
  @Override
  void run() {
    if(this.numberOfLegs<=2) {
      System.out.println("Usain Bolt");
    } else {
      System.out.println("Cheetah");
    }
  }
}
