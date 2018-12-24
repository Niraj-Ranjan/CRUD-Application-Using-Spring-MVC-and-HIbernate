package com.niraj.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="login_register")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
	
	@Column(name = "firstName")
    private String firstName;
	
	@Column(name = "middleName")
    private String middleName;
	
	@Column(name = "lastName")
    private String lastName;
	
	@Column(name = "email")
    private String email;
    
    @Column(name = "userId")
    private String userId;
    
    @Column(name = "password")
    private String password;
 
   
 
    public int getId() {
        return id;
    }
 
     public void setId(int id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getMiddleName() {
        return middleName;
    }
 
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getUserId() {
        return userId;
    }
 
    public void setUserId(String userId) {
        this.userId = userId;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }       
	

}