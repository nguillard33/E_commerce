package com.intiformation.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.intiformation.models.AdminUser;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCategorieDao(Categorie cat) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Categorie> getAllCategorieDao(AdminUser admU) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getCategorieByIdDao(Categorie cat) {
		// TODO Auto-generated method stub
		return null;
	}

}
