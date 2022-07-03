package com.owliance.oav.wvo;

import com.owliance.oav.entity.BaseWVO;

public class EntrepriseWvo extends BaseWVO {

    private Integer idEntreprise;
    private Integer CodeEntreprise;

    private String siret;

    private String raisonSociale;

    private String ape;
    private Integer numeroVoieEtablissement;
    private String typeVoieEtablissement;
    private String libelleVoieEtablissement;
    private String libelleCommuneEtablissement;
    private String mail;
    private Integer tel;

//adr= numeroVoieEtablissement+typeVoieEtablissement+libelleVoieEtablissement+codePostalEtablissement+libelleCommuneEtablissement



    private String codePostal;

    public Integer getIdEntreprise() {
        return idEntreprise;
    }

    public void setIdEntreprise(Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
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

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Integer getCodeEntreprise() {
        return CodeEntreprise;
    }

    public void setCodeEntreprise(Integer codeEntreprise) {
        CodeEntreprise = codeEntreprise;
    }

    public EntrepriseWvo(){};


}
