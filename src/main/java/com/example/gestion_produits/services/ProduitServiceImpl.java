package com.example.gestion_produits.services;

import com.example.gestion_produits.entities.Produit;
import com.example.gestion_produits.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl  implements  ProduitService {

    @Autowired
    ProduitRepository produitRepository;
    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(Produit p) {
       produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Long id) {
           produitRepository.deleteById(id);
    }

    @Override
    public Produit getProduit(Long id) {
      return  produitRepository.findById(id).get();
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}
