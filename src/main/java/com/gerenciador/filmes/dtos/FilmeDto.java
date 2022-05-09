package com.gerenciador.filmes.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class FilmeDto {
    private String titulo;
    private String urlFoto;
    private String dtLancamento;
    private String descricao;
    private Number nota;
    private String urlImdb;
    private String genero;
}
