package com.owliance.oav.endpoint.rest;

import com.owliance.oav.wvo.ReponseAvantVenteWvo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ReponseAvantVenteEndpoint {
    @PostMapping(value ="/createResponse")
    ReponseAvantVenteWvo createResponse(@RequestBody ReponseAvantVenteWvo reponseAvantVenteWvo);

    @GetMapping(value = "getAllResponsesByQuestion")
    List<ReponseAvantVenteWvo> getResponsesByQuestion(Integer idQuestion);

}
