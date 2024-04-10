package com.example.gestion_produits.services;

import com.example.gestion_produits.entities.Produit;

import java.util.List;

public interface ProduitService {

    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();

}
