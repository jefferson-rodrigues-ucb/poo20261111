package org.example;

import org.example.dao.AutorDAO;
import org.example.entities.Autor;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<Autor> autores = AutorDAO.getAllAutor();

            for(Autor autor : autores) {
                System.out.println(autor);
            }
        } catch (SQLException e) {
            System.out.println("Erro de conexão com MySQL: " + e.getMessage());
        }

    }
}