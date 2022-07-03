package com.owliance.oav.controller;


import com.owliance.oav.bvo.EntrepriseBvo;
import com.owliance.oav.dto.EntrepriseINSEE;
import com.owliance.oav.endpoint.rest.EntrepriseEndpoint;
import com.owliance.oav.service.EntrepriseService;
import com.owliance.oav.wvo.EntrepriseWvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/entreprise")

public class EntrepriseController extends BaseController implements EntrepriseEndpoint {

    @Autowired
    private EntrepriseService entrepriseService;

    @Override
    public EntrepriseINSEE getInseeInformations(String siret) {
        return entrepriseService.getEntreprise(siret);



    }

    @Override
    public EntrepriseWvo addEntreprise(EntrepriseWvo entrepriseWvo) {
        return bvoToWvo(entrepriseService.createEntreprise(wvoToBvo(entrepriseWvo, EntrepriseBvo.class)),EntrepriseWvo.class);
    }

    @Override
    public EntrepriseWvo updateEntreprise(EntrepriseWvo entrepriseWvo) {
       // return bvoToWvo(entrepriseService.updateEntreprise(wvoToBvo(entrepriseWvo, EntrepriseBvo.class)), EntrepriseWvo.class);
        return null;
    }


}
