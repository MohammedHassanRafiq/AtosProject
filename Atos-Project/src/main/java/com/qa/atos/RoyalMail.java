package com.qa.atos;

public class RoyalMail {

	private int id;
	private String Firstname;
	private String Secondname;
	private int PhoneNumber;
	private String Address;

	public RoyalMail() {
		super();
	}

	public RoyalMail(int id, String Firstname, String Secondname, int PhoneNumber, String Address) {
		super();
		this.id = id;
		this.Firstname = Firstname;
		this.Secondname = Secondname;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
	}

	public RoyalMail( String Firstname, String Secondname, int PhoneNumber, String Address) {
		super();
		this.Firstname = Firstname;
		this.Secondname = Secondname;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}

	public String getSecondname() {
		return Secondname;
	}

	public void setSecondname(String Secondname) {
		this.Secondname = Secondname;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	@Override
	public String toString() {
		return "RoyalMail [id=" + id + ", Firstname=" + Firstname + ", Secondname=" + Secondname + ", PhoneNumber=" + PhoneNumber
				+ ", Address=" + Address + "]";
	}

}
