package com.owliance.oav.bvo;

import com.owliance.oav.entity.BaseBVO;
import com.owliance.oav.vo.ReponseAvantVenteVo;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

public class QuestionAvantVenteBvo extends BaseBVO {
    private Integer idQuestion;
    private Integer codeQuestion;

    private String enonce;
    private List<ReponseAvantVenteVo> reponses = new ArrayList<ReponseAvantVenteVo>();


    public QuestionAvantVenteBvo(){}


    public Integer getCodeQuestion() {
        return codeQuestion;
    }

    public void setCodeQuestion(Integer codeQuestion) {
        this.codeQuestion = codeQuestion;
    }

    public Integer getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public List<ReponseAvantVenteVo> getReponses() {
        return reponses;
    }

    public void setReponses(List<ReponseAvantVenteVo> reponses) {
        this.reponses = reponses;
    }
}
