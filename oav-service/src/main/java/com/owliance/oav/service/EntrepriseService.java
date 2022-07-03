package com.owliance.oav.service;

import com.owliance.oav.bvo.EntrepriseBvo;
import com.owliance.oav.dto.EntrepriseINSEE;
import com.owliance.oav.vo.EntrepriseVo;

import java.util.List;

public interface EntrepriseService {




     List<EntrepriseBvo> getAllEntreprises();
     EntrepriseINSEE getEntreprise(String siret);
     EntrepriseBvo createEntreprise(EntrepriseBvo entrepriseBvo);
     EntrepriseBvo updateEntreprise(EntrepriseBvo entrepriseBvo);
}
