package com.owliance.oav.vo;

import com.owliance.oav.entity.BaseVO;

import javax.persistence.*;

@Entity
@Table(name = "entreprise",schema = "oav_collectif")

public  class EntrepriseVo extends BaseVO  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_entreprise")
    private Integer idEntreprise;
    @Column(name = "siret")
    private String siret;
    @Column(name = "code_entreprise")
    private Integer CodeEntreprise;
     @Column(name ="raison_sociale")
    private String raisonSociale;
     @Column(name ="ape")
    private String  ape;



    @Column(name ="mail")
    private String mail;
     @Column(name ="tel")
    private Integer tel;
    @Column(name ="num_voie")
    private Integer numeroVoieEtablissement;
    @Column(name ="type_voie")
    private String typeVoieEtablissement;
    @Column(name ="libelle_voie")
    private String libelleVoieEtablissement;
    @Column(name ="libelle_commune")
    private String libelleCommuneEtablissement;
    @Column(name ="code_postal")
    private String codePostal;

    public Integer getIdEntreprise() {
        return idEntreprise;
    }

    public void setIdEntreprise(Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }
    public Integer getCodeEntreprise() {
        return CodeEntreprise;
    }

    public void setCodeEntreprise(Integer codeEntreprise) {
        CodeEntreprise = codeEntreprise;
    }
    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Integer getNumeroVoieEtablissement() {
        return numeroVoieEtablissement;
    }

    public void setNumeroVoieEtablissement(Integer numeroVoieEtablissement) {
        this.numeroVoieEtablissement = numeroVoieEtablissement;
    }

    public String getTypeVoieEtablissement() {
        return typeVoieEtablissement;
    }

    public void setTypeVoieEtablissement(String typeVoieEtablissement) {
        this.typeVoieEtablissement = typeVoieEtablissement;
    }

    public String getLibelleVoieEtablissement() {
        return libelleVoieEtablissement;
    }

    public void setLibelleVoieEtablissement(String libelleVoieEtablissement) {
        this.libelleVoieEtablissement = libelleVoieEtablissement;
    }

    public String getLibelleCommuneEtablissement() {
        return libelleCommuneEtablissement;
    }

    public void setLibelleCommuneEtablissement(String libelleCommuneEtablissement) {
        this.libelleCommuneEtablissement = libelleCommuneEtablissement;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public EntrepriseVo(){};



}
