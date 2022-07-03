package com.owliance.oav.vo;

import javax.persistence.*;

@Table(name = "type_produit", schema = "oav_collectif")
@Entity
public class TypeProduitVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_prod")
    private Integer idTypeProd ;

    @Column(name = "code_type_produit")
    private Integer codeTypeProd ;

    @Column(name = "libelle")
    private String libelle ;

    public TypeProduitVo(){}

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
