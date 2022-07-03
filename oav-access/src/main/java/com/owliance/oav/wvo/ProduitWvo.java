package com.owliance.oav.wvo;

import com.owliance.oav.entity.BaseWVO;

public class ProduitWvo  extends BaseWVO {
    private Integer idProduit;
    private Integer CodeProduit;

    private  String libelle;
    private Integer typeProduit;

    public ProduitWvo(){}


    public Integer getCodeProduit() {
        return CodeProduit;
    }

    public void setCodeProduit(Integer codeProduit) {
        CodeProduit = codeProduit;
    }

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(Integer typeProduit) {
        this.typeProduit = typeProduit;
    }
}
