package com.owliance.oav.service;

import com.owliance.oav.bvo.EntrepriseBvo;
import com.owliance.oav.bvo.QuestionAvantVenteBvo;

import java.util.List;

public interface QuestionAvantVenteService {
    QuestionAvantVenteBvo createQuestion(QuestionAvantVenteBvo questionAvantVenteBvo);
    List<QuestionAvantVenteBvo>getAllQuestions();

}
