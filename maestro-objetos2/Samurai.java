

public class Samurai extends Human {
  private Integer count;
  public Samurai(int strength, int intelligence, int stealth, int health ) {
    super(strength, intelligence, stealth, (health*2));
  }
  public Integer deathBlow(Human target){
    count++;
    super.health /= 2;
    target.health -= target.health;
    return target.health;
  }
  public Integer meditate(){
    super.health += (super.health/2);
    return super.health;
  }
  public void howMany(){
    System.out.println("Asesinatos totales: " + count);
  }
}
