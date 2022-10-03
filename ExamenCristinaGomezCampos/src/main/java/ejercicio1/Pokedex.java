package ejercicio1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristina Gómez Campos
 */
@XmlRootElement(name="pokedex")
public class Pokedex {
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    public Pokedex() {
    }

    public Pokedex(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @XmlElement(name= "pokemon")
    public List<Pokemon> getPokemons() {
        return pokemons;
    }


    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return "Pokedex{" +
                "pokemons=" + pokemons +
                '}';
    }
}
