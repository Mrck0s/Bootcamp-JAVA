package pokemon;

public abstract class AbstractPokemon implements PokeInterface {
  public Pokemon createPokemon(String nameParam, Integer healthParam, String typeParam) {
    return new Pokemon(nameParam, healthParam, typeParam);
  }
  public String pokemonInfo(Pokemon pokemon) {
    return "Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType();
  }
}
