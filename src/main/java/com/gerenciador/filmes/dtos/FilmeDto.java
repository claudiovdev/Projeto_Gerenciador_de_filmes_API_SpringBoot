package com.gerenciador.filmes.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter
@Setter
public class FilmeDto {
    private String titulo;
    private String urlFoto;
    private String dtLancamento;
    private String descricao;
    private Number nota;
    private String urlImdb;
    private String genero;
}
