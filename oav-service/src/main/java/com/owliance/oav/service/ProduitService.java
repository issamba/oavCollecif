package com.owliance.oav.service;

import com.owliance.oav.bvo.ProduitBvo;
import com.owliance.oav.repository.ReponseAvantVenteRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ProduitService {
ProduitBvo createProduct (ProduitBvo produitBvo);
List<ProduitBvo> getAllProducts();
}
