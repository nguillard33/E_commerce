package com.intiformation.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ligneCommande")
public class LigneCommande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_lc;
	
	private int quantite;
	private int prix;
	
	
	
	/*transfo association uml en java*/
	/*association avec produit*/
	@OneToMany(mappedBy="lc",cascade={CascadeType.REMOVE, CascadeType.PERSIST}, fetch=FetchType.EAGER)
	private List<Produit> prods;
	
	/*association avec commande*/
	@ManyToOne
	@JoinColumn(name="c_lc",referencedColumnName="id_com")
	private Commande c;
	
	
	//constructeurs
	public LigneCommande() {
		super();
	}
	
	


	public LigneCommande(int quantite, int prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}


	//getters et setters

	public int getQuantite() {
		return quantite;
	}




	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}




	public int getPrix() {
		return prix;
	}




	public void setPrix(int prix) {
		this.prix = prix;
	} 
	
	
	
	
	
}
