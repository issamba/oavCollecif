package com.owliance.oav.bvo;

import com.owliance.oav.entity.BaseBVO;

public class ReponseAvantVenteBvo extends BaseBVO {
    private Integer idRepAv;
    private Integer codeRepAv;

    private String enonce;
    private Integer question;

    public ReponseAvantVenteBvo(){}


    public Integer getCodeRepAv() {
        return codeRepAv;
    }

    public void setCodeRepAv(Integer codeRepAv) {
        this.codeRepAv = codeRepAv;
    }

    public Integer getIdRepAv() {
        return idRepAv;
    }

    public void setIdRepAv(Integer idRepAv) {
        this.idRepAv = idRepAv;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }
}
