package br.com.rodrigo.ponto.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Ocorrencia {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String descricao;
}
