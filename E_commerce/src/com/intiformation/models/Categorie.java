package com.intiformation.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="categories")
public class Categorie  {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_cat")
	private Long  idCategorie;
	private String nomCategorie;
	@Lob
	private byte photo;
	@Transient 
	private String img;
	private String description;

	
	/*transfo association uml en java*/
	//fetch =fetchType.eager: chargement liste prods en mm temps qu'une catégorie;cascade: propagation opération sur les classes esclaves sur les classes maitres
	@OneToMany(mappedBy="categorie", cascade={CascadeType.REMOVE, CascadeType.PERSIST}, fetch=FetchType.EAGER)
	private List<Produit> prods;
	
	
	//constructeurs : 


	public Categorie() {
		super();
	}


	public Categorie(String nomCategorie, byte photo, String img, String description) {
		super();
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.img = img;
		this.description = description;
	}


	public Categorie(Long idCategorie, String nomCategorie, byte photo, String img, String description) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.img = img;
		this.description = description;
	}


	
	//getters et setters 
	public Long getIdCategorie() {
		return idCategorie;
	}


	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}


	public String getNomCategorie() {
		return nomCategorie;
	}


	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}


	public byte getPhoto() {
		return photo;
	}


	public void setPhoto(byte photo) {
		this.photo = photo;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
