package com.mmacaiteria.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;
    
    private String title;
    private String description;
    private String price;
    private String category;
    private String image;
    private String limitRule; // Regra de montagem (ex: "300ml")
}