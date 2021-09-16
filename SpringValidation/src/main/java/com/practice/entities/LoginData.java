package com.practice.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {
	@NotBlank(message="name can't be empty")
	@Size(min = 3, max = 12, message="name should be under 3 to 12 character" )
	private String userName;
	
	@Email(regexp = "^(.+)@(.+)$",  message="please fill the correct formate")
	private String email;
	@AssertTrue
	private boolean agreed;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	
}
