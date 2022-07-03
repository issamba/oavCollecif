package com.owliance.oav.endpoint.rest;

import com.owliance.oav.wvo.ProduitWvo;
import com.owliance.oav.wvo.QuestionAvantVenteWvo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProduitEndpoint {
    @PostMapping(value = "/createProduct")
    ProduitWvo createProduct(@RequestBody ProduitWvo ProduitWvo);

    @GetMapping(value = "/getAllProducts")
    List<ProduitWvo> getAllProducts() ;
}
