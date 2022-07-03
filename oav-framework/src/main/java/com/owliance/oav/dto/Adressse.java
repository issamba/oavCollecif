package com.owliance.oav.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Adressse implements Serializable {
    @JsonProperty
    private String numeroVoieEtablissement;
    @JsonProperty
    private String typeVoieEtablissement;
    @JsonProperty
    private String libelleVoieEtablissement;
    @JsonProperty
    private String codePostalEtablissement;
    @JsonProperty
    private String libelleCommuneEtablissement;

    public Adressse(){}
    public Adressse(String numeroVoieEtablissement, String typeVoieEtablissement, String libelleVoieEtablissement, String codePostalEtablissement, String libelleCommuneEtablissement) {
        this.numeroVoieEtablissement = numeroVoieEtablissement;
        this.libelleCommuneEtablissement = libelleCommuneEtablissement;
        this.typeVoieEtablissement = typeVoieEtablissement;
        this.libelleVoieEtablissement = libelleVoieEtablissement;
        this.codePostalEtablissement = codePostalEtablissement;
    }

    public String getNumeroVoieEtablissement() {
        return numeroVoieEtablissement;
    }

    public void setNumeroVoieEtablissement(String numeroVoieEtablissement) {
        this.numeroVoieEtablissement = numeroVoieEtablissement;
    }

    public String getLibelleCommuneEtablissement() {
        return libelleCommuneEtablissement;
    }

    public void setIndiceRepetitionEtablissement(String libelleCommuneEtablissement) {
        this.libelleCommuneEtablissement = libelleCommuneEtablissement;
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

    public String getCodePostalEtablissement() {
        return codePostalEtablissement;
    }

    public void setCodePostalEtablissement(String codePostalEtablissement) {
        this.codePostalEtablissement = codePostalEtablissement;
    }
}
