package com.owliance.oav.service.impl;

import com.owliance.oav.bvo.ProduitBvo;
import com.owliance.oav.bvo.QuestionAvantVenteBvo;
import com.owliance.oav.bvo.ReponseAvantVenteBvo;
import com.owliance.oav.repository.ProduitRepositoryDao;
import com.owliance.oav.service.ProduitService;
import com.owliance.oav.vo.ProduitVo;
import com.owliance.oav.vo.ReponseAvantVenteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BaseService;

import java.util.List;

@Service
public class ProduitServiceImpl extends BaseService implements ProduitService {

    @Autowired
    ProduitRepositoryDao produitRepositoryDao;
    @Override
    public ProduitBvo createProduct(ProduitBvo produitBvo) {
        return voToBvo(produitRepositoryDao.saveAndFlush(bvoToVo(produitBvo, ProduitVo.class)),ProduitBvo.class);

    }

    @Override
    public List<ProduitBvo> getAllProducts() {
        return listVoToBvo(produitRepositoryDao.findAll(), ProduitBvo.class);
    }
}
