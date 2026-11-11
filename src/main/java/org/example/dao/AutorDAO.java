package org.example.dao;

import org.example.entities.Autor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO {

    public static List<Autor> getAllAutor() throws SQLException {
        List<Autor> autores = new ArrayList<>();
        String query = "select id, nome from Autor;";

        try(Connection conn = ConexaoMySQL.conectar();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()) {

            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                autores.add(new Autor(id, nome));
            }

            return autores;
        }

    }
}
