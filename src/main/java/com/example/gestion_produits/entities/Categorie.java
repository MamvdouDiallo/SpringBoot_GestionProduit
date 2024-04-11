package com.example.gestion_produits.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long IdCat;
    private  String nomCate;
    private String descriptionCat;

    @OneToMany (mappedBy = "categorie")

    private List<Produit> produits;


}
