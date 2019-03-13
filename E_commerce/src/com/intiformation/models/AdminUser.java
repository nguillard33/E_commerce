package com.intiformation.models;

public class AdminUser {
	
	//attributs
	private int idAdmin;
	private String adminUsername;
	private String adminMdp;
	
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
	
	//ToString
	@Override
	public String toString() {
		return "AdminUser [idAdmin=" + idAdmin + ", adminUsername=" + adminUsername + ", adminMdp=" + adminMdp + "]";
	}
	
	
	

}