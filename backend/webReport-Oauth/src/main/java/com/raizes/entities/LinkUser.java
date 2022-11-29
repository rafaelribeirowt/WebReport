package com.raizes.entities;

import java.io.Serializable;
import java.util.Objects;



public class LinkUser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String loginUsuario;
	private String senha;
	private String perfil;
	private String nome;
	private Boolean inativo;

	public LinkUser() {
	}

	public LinkUser(Long id, String loginUsuario, String senha, String perfil, String nome, Boolean inativo) {
		this.id = id;
		this.loginUsuario = loginUsuario;
		this.senha = senha;
		this.perfil = perfil;
		this.nome = nome;
		this.inativo = inativo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getloginUsuario() {
		return loginUsuario;
	}

	public void setloginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getInativo() {
		return inativo;
	}

	public void setInativo(Boolean inativo) {
		this.inativo = inativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, inativo, loginUsuario, nome, perfil, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkUser other = (LinkUser) obj;
		return Objects.equals(id, other.id) && Objects.equals(inativo, other.inativo)
				&& Objects.equals(loginUsuario, other.loginUsuario) && Objects.equals(nome, other.nome)
				&& Objects.equals(perfil, other.perfil) && Objects.equals(senha, other.senha);
	}

}
