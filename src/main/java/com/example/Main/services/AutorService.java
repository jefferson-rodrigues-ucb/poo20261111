package com.example.Main.services;

import com.example.Main.entities.Autor;
import com.example.Main.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public List<Autor> findByName(String nome) {
        return autorRepository.findByNome(nome);
    }
}
