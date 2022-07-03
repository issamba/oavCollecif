package com.owliance.oav.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class EntrepriseINSEE implements Serializable {
 List<ResponseEtablissement> etablissements;
    public EntrepriseINSEE(){}
    public EntrepriseINSEE(List<ResponseEtablissement> etablissements) {
        this.etablissements = etablissements;
    }

    public List<ResponseEtablissement> getEtablissements() {
        return etablissements;
    }

    public void setEtablissements(List<ResponseEtablissement> etablissements) {
        this.etablissements = etablissements;
    }


}
