package daos;

import models.Pokemon;

import java.util.Set;

public interface UserDao {
    Pokemon getPokemon();
    Set<Pokemon> getAllPokemon();
    Pokemon getPokemonByPokemonNameAndPassword();
    boolean insertPokemon();
    boolean updatePokemon();
    boolean deletePokemon();
}