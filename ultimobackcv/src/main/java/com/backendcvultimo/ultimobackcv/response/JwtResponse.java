package com.backendcvultimo.ultimobackcv.response;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class JwtResponse {

	private String token;
	private Long id;
	private String username;
	private String email;
	private List<String> roles;
	private Collection<? extends GrantedAuthority> authorities;

	public JwtResponse() {
		// TODO Auto-generated constructor stub
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public JwtResponse(String token, long id, String username, String email, List<String> roles, Collection<? extends GrantedAuthority> authorities) {
		this.token = token;
		this.id = id;//id
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.authorities = authorities;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String token) {
		this.token = token;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}

}
