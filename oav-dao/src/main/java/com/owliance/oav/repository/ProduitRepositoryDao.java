package com.owliance.oav.repository;

import com.owliance.oav.vo.ProduitVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepositoryDao extends JpaRepository<ProduitVo,Integer> {
}
