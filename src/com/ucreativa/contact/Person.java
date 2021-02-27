package com.ucreativa.contact;

import java.util.List;

import com.ucreativa.IUser;

public class Person extends Contact implements IUser{

	private int id_person;
	private Company company;
	private String job_title;

	//Constructor
	public Person(String name, String address, String email, String city, String postal_code, String province,
			String country, int phone, int mobile, String trade_name, String website, List<String> tags,
			String id_contact_type, int id_group, Company company, String job_title, int id_person) {
		super(name, address, email, city, postal_code, province, country, phone, mobile, trade_name, website, tags,
				id_contact_type, id_group);
		this.company = company;
		this.job_title = job_title;
		this.id_person = id_person;
	}
	
	//Methods Set and Get
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public int getId_person() {
		return id_person;
	}

	public void setId_person(int id_person) {
		this.id_person = id_person;
	}

	//Method ToString
	@Override
	public String toString() {
		return "Person [id_person=" + id_person + ", company=" + company + ", job_title=" + job_title + "]";
	}

	@Override
	public void LogIn() {
	}

	@Override
	public void LogOut() {
	}

	@Override
	public void ResetPassword() {
	}
}
