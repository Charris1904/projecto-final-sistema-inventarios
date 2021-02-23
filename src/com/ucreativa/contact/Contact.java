package com.ucreativa.contact;

import java.util.List;

public class Contact {

	protected String name;
	protected String address;
	protected String email;
	protected String city;
	protected String postal_code;
	protected String province;
	protected String country;
	protected int phone;
	protected int mobile;
	protected String trade_name;
	protected String website;
	protected List<String> tags;
	protected String id_contact_type;
	protected int id_group;
	
	//Constructor
	public Contact(String name, String address, String email, String city, String postal_code, String province,
			String country, int phone, int mobile, String trade_name, String website, List<String> tags,
			String id_contact_type, int id_group) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.city = city;
		this.postal_code = postal_code;
		this.province = province;
		this.country = country;
		this.phone = phone;
		this.mobile = mobile;
		this.trade_name = trade_name;
		this.website = website;
		this.tags = tags;
		this.id_contact_type = id_contact_type;
		this.id_group = id_group;
	}

	//Methods Set and Get
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getTrade_name() {
		return trade_name;
	}

	public void setTrade_name(String trade_name) {
		this.trade_name = trade_name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	public String getId_contact_type() {
		return id_contact_type;
	}

	public void setId_contact_type(String id_contact_type) {
		this.id_contact_type = id_contact_type;
	}

	public int getId_group() {
		return id_group;
	}

	public void setId_group(int id_group) {
		this.id_group = id_group;
	}

	//Method ToString
	@Override
	public String toString() {
		return "Contact [name=" + name + ", address=" + address + ", email=" + email + ", city=" + city
				+ ", postal_code=" + postal_code + ", province=" + province + ", country=" + country + ", phone="
				+ phone + ", mobile=" + mobile + ", trade_name=" + trade_name + ", website=" + website + ", tags="
				+ tags + ", id_contact_type=" + id_contact_type + ", id_group=" + id_group + "]";
	}
}