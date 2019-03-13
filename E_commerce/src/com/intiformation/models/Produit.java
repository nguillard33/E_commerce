package com.intiformation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name="produits")
public class Produit {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	
	private String designation;
	private String description;
	private double prix;
	private int quantite;
	private boolean selectionnee;
	private String photo;
	
	
	/*transformation association uml en java*/
//	@ManyToOne
//	@JoinColumn(name="categorie_p", referencedColumnName="idCategorie" )
//	private Categorie categorie;
//	
//	@ManyToOne
//	@JoinColumn(name="lc_p",referencedColumnName="id_lc")
//	private LigneCommande lc;
	
	public Produit() {
		super();
	}


	public Produit(String designation, String description, double prix, int quantite, boolean selectionnee,
			String photo) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionnee = selectionnee;
		this.photo = photo;
	}


	public Produit(Long idProduit, String designation, String description, double prix, int quantite,
			boolean selectionnee, String photo) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionnee = selectionnee;
		this.photo = photo;
	}


	public Long getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public boolean isSelectionnee() {
		return selectionnee;
	}


	public void setSelectionnee(boolean selectionnee) {
		this.selectionnee = selectionnee;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
	
	
	
	
}
