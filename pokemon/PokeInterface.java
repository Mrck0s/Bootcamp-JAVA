package pokemon;

public interface PokeInterface {
  Pokemon createPokemon(String nameParam, Integer healthParam, String typeParam);
  String pokemonInfo(Pokemon pokemon);
  void listPokemon();
}
