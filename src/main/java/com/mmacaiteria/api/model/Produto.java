package com.mmacaiteria.api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;

    private String nome;
    private String descricao;
    private Double preco;
    private String imagemUrl;
    private String categoria;
}