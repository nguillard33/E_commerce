package com.intiformation.service;

import java.util.List;

import com.intiformation.models.AdminUser;
import com.intiformation.models.Produit;

public interface IProduitService {

	public Produit addProduitService(Produit produit);

	public int supprProduitService(Produit produit);

	public int updateProduitService(Produit produit);

	public List<Produit> getAllProduitService(AdminUser admU);

	public Produit getProduitByIdService(Produit produit);

}
