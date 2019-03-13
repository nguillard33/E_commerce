package com.intiformation.service;

import java.util.List;

import com.intiformation.models.AdminUser;
import com.intiformation.models.Categorie;

public interface ICategorieService {
	
	public Categorie addCategorieService(Categorie cat);
	
	public int supprCategorieService(Categorie cat);
	
	public int updateCategorieService(Categorie cat);
	
	public List<Categorie> getAllCategorieService(AdminUser admU);
	
	public Categorie getCategorieByIdService(Categorie cat);

}
