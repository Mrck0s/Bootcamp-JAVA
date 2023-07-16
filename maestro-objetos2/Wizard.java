
public class Wizard extends Human {
  public Wizard(int strength, int intelligence, int stealth, int health ) {
    super(strength, (intelligence + 5), stealth, (health/2));
  }

  public Integer heal(Human target){
    target.health += super.intelligence;
    return target.health;
  }
  public Integer fireBall(Human target){
    target.health -= (super.intelligence*3);
    return target.health;
  }
}