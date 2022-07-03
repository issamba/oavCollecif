package com.owliance.oav.controller;

import com.owliance.oav.bvo.ReponseAvantVenteBvo;
import com.owliance.oav.endpoint.rest.ReponseAvantVenteEndpoint;
import com.owliance.oav.service.ReponseAvantVenteService;
import com.owliance.oav.wvo.ReponseAvantVenteWvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/response")
public class ReponseAvantVenteController extends BaseController implements ReponseAvantVenteEndpoint {

    @Autowired
    ReponseAvantVenteService reponseAvantVenteService;
    @Override
    public ReponseAvantVenteWvo createResponse(ReponseAvantVenteWvo reponseAvantVenteWvo) {
        return bvoToWvo(reponseAvantVenteService.createResponse(wvoToBvo(reponseAvantVenteWvo,ReponseAvantVenteBvo.class)),ReponseAvantVenteWvo.class);
    }

    @Override
    public List<ReponseAvantVenteWvo> getResponsesByQuestion(Integer idQuestion) {
//        return listBvoToWvo(reponseAvantVenteService.getResponseByQuestion(idQuestion),ReponseAvantVenteWvo.class);
        return null;
    }
}
