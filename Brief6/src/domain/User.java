package domain;

public class User {
	
	
	private int UserId;
	private String FirstName,LastName,Email,City,Country;
	
	
	
	public User( String FirstName, String LastName, String Email, String  City,
	String Country) {
		
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.City = City;
		this.Country = Country;
		
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", City=" + City + ", Country=" + Country + "]";
	}
	
	
	
	

}
