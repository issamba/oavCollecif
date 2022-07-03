package com.owliance.oav.vo;

import com.owliance.oav.entity.BaseVO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "question_avant_vente", schema = "oav_collectif")
@Entity
public class QuestionAvantVenteVo extends BaseVO {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_question_avantV")
    private Integer idQuestion;

    @Column(name = "code_question_avant_vente")
    private Integer codeQuestion;
    @Column(name = "enonce")
    private String enonce;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question", cascade = CascadeType.ALL)
    private List<ReponseAvantVenteVo> reponses = new ArrayList<ReponseAvantVenteVo>();

    public QuestionAvantVenteVo() {
    }

    ;


    public Integer getIdQuestion() {
        return idQuestion;
    }

    public Integer getCodeQuestion() {
        return codeQuestion;
    }

    public void setCodeQuestion(Integer codeQuestion) {
        this.codeQuestion = codeQuestion;
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
