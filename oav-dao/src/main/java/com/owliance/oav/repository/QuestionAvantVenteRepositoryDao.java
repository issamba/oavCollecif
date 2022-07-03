package com.owliance.oav.repository;

import com.owliance.oav.vo.QuestionAvantVenteVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionAvantVenteRepositoryDao extends JpaRepository<QuestionAvantVenteVo, Integer> {

}
