package springboot.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Users {
	
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column(name = "id", nullable = false)
	private Long userId;
	
	@Column(name = "fname", nullable = false)
	private String fname;
	
	@Column(name = "lname", nullable = false)
	private String  lname;
	
	@Column(name = "email", nullable = false)
	private String  email;
	  
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	    
	@Column(name = "password", nullable = false)	
	private String  password;
	
	
	
	

}

