package com.devsuperior.movieflix.entities.dtos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	@NotBlank(message = "Required field!")
	private String name;
	@Email(message = "Campo Invalido!")
	private String email;
	
	private Set<ReviewDTO> reviews = new HashSet<>();

	private Set<RoleDTO> roles = new HashSet<>();

	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		
		entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
		entity.getReviews().forEach(reviews -> this.reviews.add(new ReviewDTO(reviews)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<ReviewDTO> getReviews() {
		return reviews;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
}