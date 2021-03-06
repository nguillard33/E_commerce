package com.intiformation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="produits")
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	
	private String designation;
	private String description;
	private double prix;
	private int quantite;
	private boolean selectionnee;
	@Lob
	private byte photo;
	@Transient
	private String img;
	
	
	/*transformation association uml en java*/
	@ManyToOne
	@JoinColumn(name="cat_id", referencedColumnName="id_cat" )
	private Categorie categorie;
	
	
	@ManyToOne
	@JoinColumn(name="lc_p",referencedColumnName="id_lc")
	private LigneCommande lc;
	
	//association produit-admin
	@ManyToOne
	@JoinColumn(name="adm_id", referencedColumnName="id_adm")
	private AdminUser adminUser;
	
	public Produit() {
		super();
	}


	public Produit(String designation, String description, double prix, int quantite, boolean selectionnee,
			byte photo, String img) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionnee = selectionnee;
		this.photo = photo;
		this.img = img;
	}


	public Produit(Long idProduit, String designation, String description, double prix, int quantite,
			boolean selectionnee, byte photo, String img) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionnee = selectionnee;
		this.photo = photo;
		this.img = img;
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


	public byte getPhoto() {
		return photo;
	}


	public void setPhoto(byte photo) {
		this.photo = photo;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public LigneCommande getLc() {
		return lc;
	}


	public void setLc(LigneCommande lc) {
		this.lc = lc;
	}


	public AdminUser getAdminUser() {
		return adminUser;
	}


	public void setAdminUser(AdminUser adminUser) {
		this.adminUser = adminUser;
	}
	
	
	
	
	
	
	
}
