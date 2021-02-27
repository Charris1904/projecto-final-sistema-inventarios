package com.ucreativa.contact;

import java.util.List;

public class Company extends Contact {

	private int id_company;

	//Constructor
	public Company(String name, String address, String email, String city, String postal_code, String province,
			String country, int phone, int mobile, String trade_name, String website, List<String> tags,
			String id_contact_type, int id_group, int id_company) {
		super(name, address, email, city, postal_code, province, country, phone, mobile, trade_name, website, tags,
				id_contact_type, id_group);
		this.id_company = id_company;
	}
	
	//*************************** Metodos Set & Get
	public int getId_company() {
		return id_company;
	}

	public void setId_company(int id_company) {
		this.id_company = id_company;
	}
	
	/**
	* Method that searches for all the people related to a
	* specific Company
	* @param idCompany
	*/
	public void getRelatedPerson(String idCompany) {
		System.out.println("Get Related Person");
	}

	//*************************** Metodos toString
	@Override
	public String toString() {
		return "Company [id_company=" + id_company + "]";
	}
}
