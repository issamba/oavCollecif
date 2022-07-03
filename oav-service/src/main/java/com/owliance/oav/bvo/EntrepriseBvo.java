package com.owliance.oav.bvo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.owliance.oav.entity.BaseBVO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntrepriseBvo extends BaseBVO {
    private Integer idEntreprise;
    private Integer CodeEntreprise;
    @JsonProperty("siret")
    private String siret;
    @JsonProperty("denominationUniteLegale")
    private String raisonSociale;
    @JsonProperty("activitePrincipaleUniteLegale")
    private String ape;

    private String mail;

    private Integer tel;
    @JsonProperty("numeroVoieEtablissement")
    private Integer numeroVoieEtablissement;
    @JsonProperty("typeVoieEtablissement")
    private String typeVoieEtablissement;
    @JsonProperty("libelleVoieEtablissement")
    private String libelleVoieEtablissement;
    @JsonProperty("codePostalEtablissement")
    private String codePostal;
    @JsonProperty("libelleCommuneEtablissement")
    private String libelleCommuneEtablissement;


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

    public Integer getCodeEntreprise() {
        return CodeEntreprise;
    }

    public void setCodeEntreprise(Integer codeEntreprise) {
        CodeEntreprise = codeEntreprise;
    }

    public EntrepriseBvo(){};

    public EntrepriseBvo(Integer idEntreprise) {
        this.idEntreprise = idEntreprise;
    }


}
