package com.owliance.oav.endpoint.rest;


import com.owliance.oav.dto.EntrepriseINSEE;
import com.owliance.oav.wvo.EntrepriseWvo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public interface EntrepriseEndpoint {
    @GetMapping(value = "/getinformations", consumes = MediaType.APPLICATION_JSON_VALUE)
    EntrepriseINSEE getInseeInformations(@RequestParam(name = "siret") String siret);

    @PostMapping(value = "/createEntreprise")
     EntrepriseWvo addEntreprise(@RequestBody EntrepriseWvo entrepriseWvo);

    @PutMapping(value = "/modifyEntreprise")
    EntrepriseWvo updateEntreprise(@RequestBody EntrepriseWvo entrepriseWvo);

//  List<EntrepriseWvo> getEntreprises();
//    EntrepriseWvo getEntreprise(Integer id_entreprise);

}
