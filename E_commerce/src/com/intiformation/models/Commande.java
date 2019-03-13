package com.intiformation.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="commande")
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_com")
	private int idCommande;	
	private Date dateCommande;
	
	
	/*transformation association uml en java*/
	@OneToMany(mappedBy="c",cascade={CascadeType.REMOVE, CascadeType.PERSIST}, fetch=FetchType.EAGER)
	private List<LigneCommande> c_lc;
	
	@OneToOne
	@JoinColumn(name="com_client",referencedColumnName="id_client")
	private Client client;
	
	
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
