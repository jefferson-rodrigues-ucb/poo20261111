package com.example.Main.repositories;

import com.example.Main.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

    List<Autor> findByNome(String nome);
}
