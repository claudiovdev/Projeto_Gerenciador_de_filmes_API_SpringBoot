package com.gerenciador.filmes.services;

import com.gerenciador.filmes.dtos.FilmeDto;
import com.gerenciador.filmes.models.FilmeModel;
import com.gerenciador.filmes.repositories.FilmeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository filmeRepository;

    public ResponseEntity<List<FilmeModel>> findAll() {
       return ResponseEntity.status(HttpStatus.OK).body(filmeRepository.findAll());
    }

    public ResponseEntity<Object> save(FilmeDto filmeDto) {
        if(filmeRepository.existsByTitulo(filmeDto.getTitulo())){
           return ResponseEntity.status(HttpStatus.CONFLICT).body("Erro: Titulo já cadastrado");
        }

        var filme = new FilmeModel();
        BeanUtils.copyProperties(filmeDto, filme);
        filme.setDtCadastro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(filmeRepository.save(filme));
    }
}
