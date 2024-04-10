package com.example.gestion_produits.repositories;

import com.example.gestion_produits.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
