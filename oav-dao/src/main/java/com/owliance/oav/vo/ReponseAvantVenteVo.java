package com.owliance.oav.vo;

import com.owliance.oav.entity.BaseVO;

import javax.persistence.*;

@Table(name = "reponse_avant_vente", schema = "oav_collectif")
@Entity
public class ReponseAvantVenteVo extends BaseVO {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rep_av")
    private Integer idRepAv;


    @Column(name = "code_type_produit")
    private Integer codeRepAv;

    @Column(name = "enonce")
    private String enonce;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question", referencedColumnName = "id_question_avantV", nullable = true)
//   /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    private QuestionAvantVenteVo question;
    /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    public ReponseAvantVenteVo() {
    }

    public Integer getCodeRepAv() {
        return codeRepAv;
    }

    public void setCodeRepAv(Integer codeRepAv) {
        this.codeRepAv = codeRepAv;
    }

    public Integer getIdRepAv() {
        return idRepAv;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public void setIdRepAv(Integer idRepAv) {
        this.idRepAv = idRepAv;
    }

    public QuestionAvantVenteVo getQuestion() {
        return question;
    }

    public void setQuestion(QuestionAvantVenteVo question) {
        this.question = question;
    }

}
