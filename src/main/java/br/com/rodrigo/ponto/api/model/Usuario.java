package br.com.rodrigo.ponto.api.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private  JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
    
}
