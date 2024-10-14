package Pokemon;

public class Pokemon { //superclass
    //attributes (instance)
    
    //global variables (instance)
    String pokemon = "Charmander";
    public String type = "FIRE";
    private int pokemonprice = 10000;
    private int pokemoncatchrate =50;
    protected int level = 10;
    
    
   
    //constructor 
    public Pokemon(String pokemon, String type, int pokemonprice, int level, int pokemoncatchrate){
        this.pokemon = pokemon;
        this.type = type;
        this.pokemonprice = pokemonprice;
        this.pokemoncatchrate = pokemoncatchrate;
        this.level = level;
        
    }
    //standard method for all variables declared as private
    public void setPokemonPrice(int pokemonprice){ //mutator
    }
    public int getPokemonPrice(){
        return this.pokemoncatchrate;
    } 
    
    public void setPokemonCatchRate(int pokemoncatchrate){ 
    }
    public int getPokemonCatchRate(){
        return this.pokemoncatchrate;
    } 
    
}