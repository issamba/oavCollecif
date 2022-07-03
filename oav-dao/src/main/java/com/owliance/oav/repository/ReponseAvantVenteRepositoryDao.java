package com.owliance.oav.repository;

import com.owliance.oav.vo.ReponseAvantVenteVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReponseAvantVenteRepositoryDao extends JpaRepository<ReponseAvantVenteVo,Integer> {

//    List<ReponseAvantVenteVo> findAllResponseByIdPublication(Integer idQuestion);
    //ou definission-nous son corp????????
}
