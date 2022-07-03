package com.owliance.oav.vo;

import com.owliance.oav.entity.BaseVO;

import javax.persistence.*;

@Table(name = "produit", schema = "oav_collectif")
@Entity
public class ProduitVo extends BaseVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit")
    private Integer idProduit;


    @Column(name = "code_produit")
    private Integer CodeProduit;

    @Column(name = "libelle")
    private String libelle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_produit", referencedColumnName = "id_type_prod", nullable = false)
    private TypeProduitVo typeProduit;

    public ProduitVo() {
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

    public TypeProduitVo getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(TypeProduitVo typeProduit) {
        this.typeProduit = typeProduit;
    }
}
