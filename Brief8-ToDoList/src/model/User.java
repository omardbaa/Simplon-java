package model;

public class User {
	
	
	private String FirstName,LastName,UserName,PassWord;
	
	public User() {
		
	}
	
	public User(String FirstName, String LastName, String UserName, String  PassWord) {
		
	
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.UserName = UserName;
		this.PassWord = PassWord;
	
	
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
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	@Override
	public String toString() {
		return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", UserName=" + UserName
				+ ", PassWord=" + PassWord + "]";
	}
	
	
	
	

}



