package com.owliance.oav.controller;

import com.owliance.oav.bvo.QuestionAvantVenteBvo;
import com.owliance.oav.endpoint.rest.QuestionAvantVenteEndpoint;
import com.owliance.oav.service.QuestionAvantVenteService;
import com.owliance.oav.wvo.QuestionAvantVenteWvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionAvantVenteController extends BaseController implements QuestionAvantVenteEndpoint {


    @Autowired
    private QuestionAvantVenteService questionAvantVenteService;

    @Override
    public QuestionAvantVenteWvo createQuestion(QuestionAvantVenteWvo question) {

        return bvoToWvo(questionAvantVenteService.createQuestion(wvoToBvo(question, QuestionAvantVenteBvo.class)),QuestionAvantVenteWvo.class);
    }

    @Override
    public List<QuestionAvantVenteWvo> getAllQuestions() {
        return listBvoToWvo(questionAvantVenteService.getAllQuestions(), QuestionAvantVenteWvo.class);
    }
}
