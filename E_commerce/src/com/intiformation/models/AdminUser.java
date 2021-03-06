package com.intiformation.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="adminusers")
public class AdminUser {
	
	//attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_adm")
	private int idAdmin;
	private String adminUsername;
	private String adminMdp;

	
	//Association adminuser - produit
	@OneToMany(mappedBy="adminUser")
	private List<Produit> produits;
	
	//constructeurs
	public AdminUser() {
		super();
	}
	public AdminUser(String adminUsername, String adminMdp) {
		super();
		this.adminUsername = adminUsername;
		this.adminMdp = adminMdp;
	}
	public AdminUser(int idAdmin, String adminUsername, String adminMdp) {
		super();
		this.idAdmin = idAdmin;
		this.adminUsername = adminUsername;
		this.adminMdp = adminMdp;
	}
	
	//getter et setter
	public int getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminMdp() {
		return adminMdp;
	}
	public void setAdminMdp(String adminMdp) {
		this.adminMdp = adminMdp;
	}
	
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	//ToString
	@Override
	public String toString() {
		return "AdminUser [idAdmin=" + idAdmin + ", adminUsername=" + adminUsername + ", adminMdp=" + adminMdp + "]";
	}
	
	
	

}
