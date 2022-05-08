package com.gerenciador.filmes.repositories;

import com.gerenciador.filmes.models.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeModel, UUID> {

}
