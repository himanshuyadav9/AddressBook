package com.addressbook;

public class AddressBookMain {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;

	public AddressBookMain(String firstName, String lastName, String address, String city, String state, int zip,
			String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	  public String getfirstName()
	    {
	    	return firstName;
	    }
	    public void setfirstName(String firstName)
	    {
	    	this.firstName=firstName;
	    }
	    public String getlastName( )
	    {
	    	return lastName;
	    }
	    public void setlastName(String lastName)
	    {
	    	this.lastName=lastName;
	    }
	    public String getaddress( )
	    {
	    	return address;
	    }
	    public void setaddress(String address)
	    {
	    	this.address=address;
	    }
	    public String getcity( )
	    {
	    	return city;
	    }
	    public void setcity(String city)
	    {
	    	this.city=city;
	    }
	    public String getstate( )
	    {
	    	return state;
	    }
	    public void setstate(String state)
	    {
	    	this.state=state;
	    }
	    public int getzip( )
	    {
	    	return zip;
	    }
	    public void setzip(int zip)
	    {
	    	this.zip=zip;
	    }
	    public String getphoneNumber( )
	    {
	    	return phoneNumber;
	    }
	    public void setphoneNumber(String phoneNumber)
	    {
	    	this.phoneNumber=phoneNumber;
	    }


	@Override
	public String toString() {
		return "PersonInformation{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", address='" + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zip='"
				+ zip + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
	}
}
