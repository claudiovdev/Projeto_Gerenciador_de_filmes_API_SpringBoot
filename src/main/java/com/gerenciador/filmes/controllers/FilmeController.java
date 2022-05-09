package com.gerenciador.filmes.controllers;

import com.gerenciador.filmes.dtos.FilmeDto;
import com.gerenciador.filmes.models.FilmeModel;
import com.gerenciador.filmes.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping()
public class FilmeController {

    @Autowired
    FilmeService filmeService;

    @GetMapping("/filmes")
    public ResponseEntity<List<FilmeModel>> buscandoTodosOsFilmes(){
        return filmeService.findAll();
    }

    @PostMapping("/filme")
    public ResponseEntity<Object> criarFilme(@RequestBody FilmeDto filmeDto){
        return filmeService.save(filmeDto);
    }
}
