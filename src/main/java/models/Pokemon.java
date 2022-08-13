package models;

import daos.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pokemon {

// | id  | name        | primary_type | secondary_type

    private Integer id;
    private String name;
    private Integer primary_type;
    private Integer secondary_type;


    public Pokemon(Integer id, String name, Integer primary_type, Integer secondary_type) {
        this.id = id;
        this.name = name;
        this.primary_type = primary_type;
        this.secondary_type = secondary_type;
    }

    public Pokemon() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrimary_type() {
        return primary_type;
    }

    public void setPrimary_type(Integer primary_type) {
        this.primary_type = primary_type;
    }

    public Integer getSecondary_type() {
        return secondary_type;
    }

    public void setSecondary_type(Integer secondary_type) {
        this.secondary_type = secondary_type;
    }
}
