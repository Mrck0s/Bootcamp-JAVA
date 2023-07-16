
public class Human {
  protected int strength = 3;
  protected int intelligence = 3;
  protected int stealth = 3;
  protected int health = 100;

  public Human(int strength, int intelligence, int stealth, int health){
    this.strength = strength;
    this. intelligence = intelligence;
    this.stealth = stealth;
    this.health = health;
  }

  public Integer attack(Human target){
    target.health -= this.strength;
    return target.health;
  }

  }
