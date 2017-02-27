import java.util.Map;
import java.util.HashMap;


public class Pokedex {
  private Map<String, Integer> catalog;
  
  public static void main(String[] args) {
    Pokedex kantoPokedex = new Pokedex();
    kantoPokedex.capture("Bulbasaur");
    kantoPokedex.capture("Squirtle");
    
    kantoPokedex.status("Pikechu");
    kantoPokedex.status("Bulbasaur");
  }
  
  public Pokedex() {
    this.catalog = new HashMap<String, Integer>(); 
  }
  
  public void capture(String pokemonName) {
    if(!this.catalog.containsKey(pokemonName)) {
      this.catalog.put(pokemonName, 1);
    }else{
      int count = this.catalog.get(pokemonName);
      this.catalog.put(pokemonName, count+1);
    }
  }
  
  public void status(String pokemonName) {
    if(!this.catalog.containsKey(pokemonName)) {
      System.out.println("You haven't captured any " + pokemonName);
    }else{
      int count = this.catalog.get(pokemonName);
      System.out.println("You have captured " + count + " " + pokemonName);
    }
  }
}
