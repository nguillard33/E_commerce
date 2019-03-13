package com.intiformation.dao;

import java.util.List;

import com.intiformation.models.AdminUser;
import com.intiformation.models.Produit;

public interface IProduitDao {

	public Produit addProduitDao(Produit produit);

	public int supprProduitDao(Produit produit);

	public int updateProduitDao(Produit produit);

	public List<Produit> getAllProduitDao(AdminUser admU);

	public Produit getProduitByIdDao(Produit produit);

}
