package br.com.rodrigo.ponto.api.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Calendario {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
    
}
