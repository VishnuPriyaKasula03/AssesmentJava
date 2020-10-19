package com.hcl.pp.model;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="PET_USER_TABLE")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ID")
  private Long id;
  @Column(name="USER_NAME")//to be added unique constrt
  @NotEmpty(message="Mandatory Field")
  private String username;
  @Column(name="USER_PASSWD")
  private String userPassword;
  private String confirmPassword;

  @OneToMany(mappedBy ="owner", cascade = CascadeType.ALL)
  private Set<Pet> pets;
public User() {
	super();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

public String getConfirmPassword() {
	return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}

public Set<Pet> getPets() {
	return pets;
}

public void setPets(Set<Pet> pets) {
	this.pets = pets;
}
  
  
  
}