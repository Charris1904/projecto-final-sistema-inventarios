/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class User {

	/**
	 * 
	 */
	
	//Atributes
	private String email;
	private String phone;
	
	
	//Constructor
	public User() {
	
	}
		
	public User(String email, String phone) {
		this.email = email;
		this.phone = phone;
	}


	//Methods Get and Set
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//Methods
	public void LogIn(){}
	
	public void LogOut(){}
	
	public void ChangeEmail(){}


	//Method ToString
	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	

}
