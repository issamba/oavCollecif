package com.owliance.oav.service.impl;

import com.owliance.oav.bvo.QuestionAvantVenteBvo;
import com.owliance.oav.repository.QuestionAvantVenteRepositoryDao;
import com.owliance.oav.service.QuestionAvantVenteService;
import com.owliance.oav.vo.QuestionAvantVenteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.BaseService;

import java.util.List;

@Service
public class QuestionAvantVenteServiseImpl extends BaseService implements QuestionAvantVenteService {

    @Autowired
    private QuestionAvantVenteRepositoryDao questionAvantVenteRepositoryDao;

    @Transactional
    @Override
    public QuestionAvantVenteBvo createQuestion(QuestionAvantVenteBvo questionAvantVenteBvo) {
        QuestionAvantVenteVo questionAvantVenteVo = bvoToVo(questionAvantVenteBvo, QuestionAvantVenteVo.class);
        QuestionAvantVenteVo savedQuestionAvantVenteVo = questionAvantVenteRepositoryDao.saveAndFlush(questionAvantVenteVo);
        return voToBvo(savedQuestionAvantVenteVo, QuestionAvantVenteBvo.class);
    }

    @Override
    public List<QuestionAvantVenteBvo> getAllQuestions() {
        return listVoToBvo(questionAvantVenteRepositoryDao.findAll(), QuestionAvantVenteBvo.class);
    }
}
