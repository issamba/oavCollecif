package com.owliance.oav.controller;

import com.owliance.oav.bvo.ProduitBvo;
import com.owliance.oav.endpoint.rest.ProduitEndpoint;
import com.owliance.oav.service.ProduitService;
import com.owliance.oav.wvo.ProduitWvo;
import com.owliance.oav.wvo.QuestionAvantVenteWvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController extends BaseController implements ProduitEndpoint {
    @Autowired
    ProduitService produitService;

    @Override
    public ProduitWvo createProduct(ProduitWvo produitWvo) {
        return bvoToWvo(produitService.createProduct(wvoToBvo(produitWvo, ProduitBvo.class)),ProduitWvo.class);
    }

    @Override
    public List<ProduitWvo> getAllProducts() {
        return listBvoToWvo(produitService.getAllProducts(), ProduitWvo.class);
    }


}
