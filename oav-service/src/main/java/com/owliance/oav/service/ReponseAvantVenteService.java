package com.owliance.oav.service;

import com.owliance.oav.bvo.QuestionAvantVenteBvo;
import com.owliance.oav.bvo.ReponseAvantVenteBvo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ReponseAvantVenteService {
    ReponseAvantVenteBvo createResponse(ReponseAvantVenteBvo reponseAvantVenteBvo);
    List<ReponseAvantVenteBvo> getResponseByQuestion (Integer idQuestion);

}
