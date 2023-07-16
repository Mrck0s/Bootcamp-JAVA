package pokemon;

public class Pokemon {
  private String name;
  private Integer health;
  private String type;
  private static Integer count = 0;

  public Pokemon(String nameParam, Integer healthParam, String typeParam) {
    name = nameParam;
    health = healthParam;
    type = typeParam;
    count++;
  }
  public String getName() {
    return name;
  }
  public String setName(String nameParam) {
    name = nameParam;
    return name;
  }
  public Integer getHealth() {
    return health;
  }
  public Integer setHealth(Integer healthParam) {
    health = healthParam;
    return health;
  }
  public String getType() {
    return type;
  }
  public String setType(String typeParam) {
    type = typeParam;
    return type;
  }

  void attackPokemon(Pokemon target) {
    target.health -= 10;
  }
}
