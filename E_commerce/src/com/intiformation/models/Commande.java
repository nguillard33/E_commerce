package com.intiformation.models;

import java.sql.Date;
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

//@Entity
//@Table(name="commande")
public class Commande {

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCommande;	
	private Date dateCommande;
	
	
	/*transformation association uml en java*/
//	@OneToMany(mappedBy="c",cascade={CascadeType.REMOVE, CascadeType.PERSIST}, fetch=FetchType.EAGER)
//	private List<LigneCommande> c_lc;
//	
//	@ManyToOne
//	@JoinColumn(name="commande_client",referencedColumnName="idClient")
//	private Client client;
	
	
	//constructeurs
	public Commande() {
		super();
	}
	
	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}

	public Commande(int idCommande, Date dateCommande) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
	}
	
	//getters et setters
	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	
	

}
