package br.com.rodrigo.ponto.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
    
}
