package com.ucreativa;

public interface IUser {

	/*
	 * This method will login the user into the system
	 * */
	public void LogIn();
	
	/*
	 * This method will logout the user out the system
	 * */
	public void LogOut();
	
	/*
	 * This method will reset the password to it's original state
	 * */
	public void ResetPassword();

}
