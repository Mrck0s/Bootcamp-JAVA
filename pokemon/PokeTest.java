package pokemon;

public class PokeTest {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.addPoke("Charmander", 100, "Fire");
        pokedex.addPoke("Bulbasaur", 100, "Grass");
        pokedex.addPoke("Squirtle", 100, "Water");
        pokedex.addPoke("Pikachu", 100, "Electric");

        pokedex.listPokemon();




    }
}
