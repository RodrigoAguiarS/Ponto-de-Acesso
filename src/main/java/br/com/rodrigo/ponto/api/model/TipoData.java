package br.com.rodrigo.ponto.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class TipoData {

    @Id
    @GeneratedValue
    private long id;
    private String descricao;
    
}
