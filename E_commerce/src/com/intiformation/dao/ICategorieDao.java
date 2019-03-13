package com.intiformation.dao;

import java.util.List;

import com.intiformation.models.AdminUser;
import com.intiformation.models.Categorie;

public interface ICategorieDao {
	
	public Categorie addCategorieDao(Categorie cat);
	
	public int supprCategorieDao(Categorie cat);
	
	public int updateCategorieDao(Categorie cat);
	
	public List<Categorie> getAllCategorieDao(AdminUser admU);
	
	public Categorie getCategorieByIdDao(Categorie cat);

}
