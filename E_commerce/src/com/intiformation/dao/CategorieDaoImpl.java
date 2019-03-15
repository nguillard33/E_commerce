package com.intiformation.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.intiformation.models.Categorie;

@Stateless
public class CategorieDaoImpl implements ICategorieDao{

	@PersistenceContext(unitName="pu_ecommerce") //cette annotation permet d'injecter un EM instancié par le conteneur EJB
	private EntityManager em;

	@Override
	public Categorie addCategorieDao(Categorie cat) {
		//Requete JPA
		em.persist(cat);
		return cat;
	}


	@Override
	public int supprCategorieDao(Categorie cat) {
		//requete JPQL pour supprimer un element
		Query req = em.createQuery("DELETE FROM Categorie as c WHERE c.idCategorie=:pId");
		//passage des paramètres
		req.setParameter("pId", cat.getIdCategorie());
		int verif = req.executeUpdate();
		return verif;
	}

	@Override
	public int updateCategorieDao(Categorie cat) {
		//requete JPQL pour executer l'update
		Query req = em.createQuery("UPDATE Categorie as c SET c.nomCategorie=:pNom, cphoto=:pPhoto, c.description=:pDescription WHERE c.idCategorie=:pId");
		//passage des params
		req.setParameter("pNom", cat.getNomCategorie());
		req.setParameter("pPhoto", cat.getPhoto());
		req.setParameter("pDescription", cat.getDescription());
		req.setParameter("pId", cat.getIdCategorie());
		int verif = req.executeUpdate();
		return verif;
	}

	@Override
	public List<Categorie> getAllCategorieDao() {
		//Requete JPQL
		String reqJPQLliste = "SELECT c FROM Categorie as c";
		//Créer la query
		Query queryListe = em.createQuery(reqJPQLliste);
		return queryListe.getResultList();		
	}

	@Override
	public Categorie getCategorieByIdDao(Categorie cat) {
		//Requete JPA
		return em.find(Categorie.class, cat.getIdCategorie());
	}

}
