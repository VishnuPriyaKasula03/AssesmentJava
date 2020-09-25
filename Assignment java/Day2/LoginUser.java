package day2;

public class LoginUser 
{
	String username;
	String password;
	public LoginUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("Welcome! Ur id is "+this.username+"\n Ur password is "+this.password);
	}
	
	

}
