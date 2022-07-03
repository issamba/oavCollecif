package com.owliance.oav.wvo;

import com.owliance.oav.entity.BaseWVO;
import com.owliance.oav.vo.ReponseAvantVenteVo;

import java.util.List;

public class QuestionAvantVenteWvo extends BaseWVO {
    private Integer idQuestion;
    private Integer codeQuestion;

    private String enonce;
    private List<ReponseAvantVenteVo> reponses;
    public QuestionAvantVenteWvo(){};
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
