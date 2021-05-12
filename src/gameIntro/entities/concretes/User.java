package gameIntro.entities.concretes;

import gameIntro.entities.abstracts.Entity;

public class User implements Entity{
	private String identityNumber;
	private String firstName;
	private String lastName;
	private String userName;
	private String birthDay;
	
	public User() {
		
	}

	public User(String identityNumber, String firstName, String lastName, String userName, String birthDay) {
		super();
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.birthDay = birthDay;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	

}
