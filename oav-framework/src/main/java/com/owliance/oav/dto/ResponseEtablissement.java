package com.owliance.oav.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ResponseEtablissement implements Serializable {
    @JsonProperty
    private String siren;
    @JsonProperty
    private String nic;
    @JsonProperty
    private String siret;
    @JsonProperty
    private String activitePrincipaleRegistreMetiersEtablissement;
    @JsonProperty
    private UniteLegale uniteLegale;
    @JsonProperty
    private Adressse adresseEtablissement;


}
