package com.owliance.oav.service.impl;

import com.owliance.oav.bvo.QuestionAvantVenteBvo;
import com.owliance.oav.bvo.ReponseAvantVenteBvo;
import com.owliance.oav.repository.ReponseAvantVenteRepositoryDao;
import com.owliance.oav.service.ReponseAvantVenteService;
import com.owliance.oav.vo.ReponseAvantVenteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BaseService;

import java.util.List;

@Service

public class ReponseAvantVenteServiceImpl extends BaseService implements ReponseAvantVenteService {

    @Autowired
    private ReponseAvantVenteRepositoryDao reponseAvantVenteRepositoryDao;


    @Override
    public ReponseAvantVenteBvo createResponse(ReponseAvantVenteBvo reponseAvantVenteBvo) {
        return voToBvo(reponseAvantVenteRepositoryDao.saveAndFlush(bvoToVo(reponseAvantVenteBvo, ReponseAvantVenteVo.class)),ReponseAvantVenteBvo.class);
    }

    @Override
    public List<ReponseAvantVenteBvo> getResponseByQuestion(Integer idQuestion) {
//        return listVoToBvo(reponseAvantVenteRepositoryDao.findAllResponseByIdPublication(idQuestion),ReponseAvantVenteBvo.class);
        return null;

    }
}
