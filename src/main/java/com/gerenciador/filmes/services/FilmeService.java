package com.gerenciador.filmes.services;

import com.gerenciador.filmes.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository filmeRepository;
}
