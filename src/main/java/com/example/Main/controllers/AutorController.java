package com.example.Main.controllers;

import com.example.Main.entities.Autor;
import com.example.Main.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> findAll() {
        return autorService.findAll();
    }

}
