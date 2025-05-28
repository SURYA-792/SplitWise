package service.model;

public class User {
	private String email;
	private String userName;
	private String salt;
	private String password;
	private String createdOn;

	public User(String email, String userName, String salt, String password, String createdOn) {
		super();
		this.email = email;
		this.userName = userName;
		this.salt = salt;
		this.password = password;
		this.createdOn = createdOn;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getSalt() {
		return salt;
	}

	public String getPassword() {
		return password;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "email=" + email + ", Name=" + userName + ", salt=" + salt + ", password=" + password + ", createdOn="
				+ createdOn + "]";
	}

}
