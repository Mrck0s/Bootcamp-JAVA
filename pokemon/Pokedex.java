package pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
    private ArrayList<Pokemon> myPokemons;

    public Pokedex(){
        myPokemons = new ArrayList<>();

    }
    public void addPoke(String name, Integer health, String type){
        Pokemon newPokemon = createPokemon(name, health, type);
        myPokemons.add(newPokemon);
    }

    public void listPokemon() {
    for(Pokemon pokemon : myPokemons ){
        System.out.println(pokemonInfo(pokemon));
    }
    }
}
