package webscanner.models;

import javax.persistence.*;

@Table(name = "SBUsers")
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	private String login;
	private String password;
	
	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}
