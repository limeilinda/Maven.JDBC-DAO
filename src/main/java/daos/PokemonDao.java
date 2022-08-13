package daos;

import models.Pokemon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class PokemonDao implements UserDao {

    public Pokemon getPokemon(int id) {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pokemon WHERE id=" + id);

            if(rs.next())
            {
                return extractPokemonFromResultSet(rs);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        return null;

    }

    private Pokemon extractPokemonFromResultSet(ResultSet rs) {
        return null;
    }

    public Pokemon getPokemon() {
        return null;
    }

    public Set<Pokemon> getAllPokemon() {
        return null;
    }

    public Pokemon getPokemonByPokemonNameAndPassword() {
        return null;
    }

    public boolean insertPokemon() {
        return false;
    }

    public boolean updatePokemon() {
        return false;
    }

    public boolean deletePokemon() {
        return false;
    }
}
