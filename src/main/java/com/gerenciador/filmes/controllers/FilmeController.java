package com.gerenciador.filmes.controllers;

import com.gerenciador.filmes.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {

    @Autowired
    FilmeService filmeService;
}
