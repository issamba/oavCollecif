package com.owliance.oav.endpoint.rest;

import com.owliance.oav.wvo.QuestionAvantVenteWvo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface QuestionAvantVenteEndpoint {
    @PostMapping(value = "/createQuestion")
    QuestionAvantVenteWvo createQuestion(@RequestBody QuestionAvantVenteWvo question);

    @GetMapping(value = "/getAllQuestions")
    List<QuestionAvantVenteWvo> getAllQuestions() ;





}
