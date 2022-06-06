package domain;

public class Users {
	
	private static int UserId;
	private String UserName;
	
	
	
	public Users(int UserId, String UserName){
		this.UserId = UserId;
		this.UserName = UserName;
	}
	
	
	
	public static int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}



	@Override
	public String toString() {
		return "Users [UserName=" + UserName + "]";
	}



	
}


