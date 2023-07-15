
import zoo.Mammal;

public class Bat extends Mammal{
  public Bat(){
    super(300);
  }
  public void fly(){
    System.out.println("Woosh!");
    energyLevel -= 50;
  }
  public void eatHumans(){
    System.out.println("Bueno, no importa...");
    energyLevel += 25;
  }
  public void attackTown(){
    System.out.println("Ahhhhhh!");
    energyLevel -= 100;
  }
}
