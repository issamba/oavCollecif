package com.owliance.oav.bvo;

public class TypeProduitBvo {
    private Integer idTypeProd ;
    private Integer codeTypeProd ;

    private String libelle ;

    public TypeProduitBvo(){}

    public Integer getCodeTypeProd() {
        return codeTypeProd;
    }

    public void setCodeTypeProd(Integer codeTypeProd) {
        this.codeTypeProd = codeTypeProd;
    }

    public Integer getIdTypeProd() {
        return idTypeProd;
    }

    public void setIdTypeProd(Integer idTypeProd) {
        this.idTypeProd = idTypeProd;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
