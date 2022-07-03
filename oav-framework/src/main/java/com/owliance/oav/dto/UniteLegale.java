package com.owliance.oav.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class UniteLegale implements Serializable {
    private String denominationUniteLegale;

    public UniteLegale() {}

    public UniteLegale(String denominationUniteLegale) {
        this.denominationUniteLegale = denominationUniteLegale;
    }

    public String getDenominationUniteLegale() {
        return denominationUniteLegale;
    }

    public void setDenominationUniteLegale(String denominationUniteLegale) {
        this.denominationUniteLegale = denominationUniteLegale;
    }
}
