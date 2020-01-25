package com.dpslink.dpstimeapi.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Column;
import javax.persistence.*;

@Entity
@Table(name = "app_user")
public class ApplicationUser {
	@Transient
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long uid;
    
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "active")
    private boolean active;
	@Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name= "role")
    private String role;

	public long getId() {
        return uid;
    }
    
    public String getFirstname() {
    	return firstname;
    }
    
    public String getLastname() {
    	return lastname;
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
//        this.password = bCryptPasswordEncoder.encode(password);
    	this.password = password;
    }
    
    public boolean isActive() {
		return active;
	}

	public void setActive(boolean isactive) {
		this.active = isactive;
	}
    
    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
}
