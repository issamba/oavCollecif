package com.owliance.oav.bvo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Token {
    @JsonProperty("access_token")
    private  String accessToken;
    @JsonProperty("scoope")
    private String scoope;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private Integer durationOfValidity;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getScoope() {
        return scoope;
    }

    public void setScoope(String scoope) {
        this.scoope = scoope;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Integer getDurationOfValidity() {
        return durationOfValidity;
    }

    public void setDurationOfValidity(Integer durationOfValidity) {
        this.durationOfValidity = durationOfValidity;
    }
}
