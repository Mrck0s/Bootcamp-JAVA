

public class HumanTest {
  public static void main(String[] args) {
    Human prota = new Human();
    Human enemie = new Human();
    System.out.println(enemie.health);
    prota.attack(enemie);
    System.out.println(enemie.health);
  }
}
