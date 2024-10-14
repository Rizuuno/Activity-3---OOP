package Pokemon;
public class PokemonTest {
    public static void main(String args[]){
        Stats pok1 = new Stats("Charmander", "FIRE", 10000 , 45, 50);
        System.out.println("Pokemon: " + pok1.pokemon);
        System.out.println("Type: " + pok1.type);
        System.out.println("Price: " + pok1.getPokemonPrice());
        System.out.println("Level: " + pok1.level);
        System.out.println("Catch Rate: " + pok1.getPokemonCatchRate());
        System.out.println("");
     Stats pok2 = new Stats("Squirtle", "WATER", 9500 , 10, 50);
        System.out.println("Pokemon: " + pok2.pokemon);
        System.out.println("Type: " + pok2.type);
        System.out.println("Price: " + pok2.getPokemonPrice());
        System.out.println("Level: " + pok2.level);
        System.out.println("Catch Rate: " + pok2.getPokemonCatchRate());
    }
}

