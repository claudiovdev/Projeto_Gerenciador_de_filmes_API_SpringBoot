package com.gerenciador.filmes.services;

import com.gerenciador.filmes.models.FilmeModel;
import com.gerenciador.filmes.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository filmeRepository;

    public ResponseEntity<List<FilmeModel>> findAll() {
       return ResponseEntity.status(HttpStatus.OK).body(filmeRepository.findAll());
    }
}
