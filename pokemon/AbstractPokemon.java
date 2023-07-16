package pokemon;

public abstract class AbstractPokemon implements PokeInterface {
  public Pokemon createPokemon(String nameParam, Integer healthParam, String typeParam) {
    Pokemon pokemon = new Pokemon(nameParam, healthParam, typeParam);
    return pokemon;
  }
  public String pokemonInfo(Pokemon pokemon) {
    return "Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType();
  }
}
