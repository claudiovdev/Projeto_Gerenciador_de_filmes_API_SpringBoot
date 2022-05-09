package com.gerenciador.filmes.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.gerenciador.filmes.enums.FilmeEstado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter

@Entity
@Table(name = "TB_FILMES")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilmeModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID filmeId;
    @Column(nullable = false, length = 50)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String urlFoto;

    private String dtLancamento;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(nullable = false)
    private LocalDateTime dtCadastro;


    @Column(nullable = false, length = 250)
    private String descricao;

    @Column(nullable = false, length = 2)
    private Number nota;

    @Column(nullable = false, length = 100)
    private String urlImdb;

    @Column(nullable = false, length = 20)
    private String genero;

}
