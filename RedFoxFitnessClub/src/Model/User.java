package Model;

import java.time.LocalDate;

public class User {

	private String username;

	private String password;

	private String fullname;

	private int age;

	private int points;

	private int referredBy;

	private boolean guest;

	private LocalDate createdOn;

	public User() {

	}

	public User(String username, String password, String fullname, int age, int points, int referredBy, boolean guest,
			LocalDate createdOn) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.age = age;
		this.points = points;
		this.referredBy = referredBy;
		this.guest = guest;
		this.createdOn = createdOn;
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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(int referredBy) {
		this.referredBy = referredBy;
	}

	public boolean isGuest() {
		return guest;
	}

	public void setGuest(boolean guest) {
		this.guest = guest;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", fullname=" + fullname + ", age=" + age
				+ ", points=" + points + ", referredBy=" + referredBy + ", guest=" + guest + ", createdOn=" + createdOn
				+ "]";
	}

}
