
public class Ninja extends Human{
  public Ninja(int strength, int intelligence, int stealth, int health) {
    super(strength, intelligence, (stealth+7), health);
  }
  public Integer steal(Human target){
    target.health -= super.stealth;
    return target.health;
  }
  public Integer runAway(){
    super.health -= 10;
    return super.health;
  }
}
