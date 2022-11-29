package com.raizes.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class LinkProdutos implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long idProduto;
	private Long produtoCodigo;
	private String descricao;
	private Double precoCusto; 
	private Double precoVenda;
	private Boolean inativo;
	
	
	public LinkProdutos() {
	}


	public LinkProdutos(Long idProduto, Long produtoCodigo, String descricao, Double precoCusto, Double precoVenda,
			Boolean inativo) {
		this.idProduto = idProduto;
		this.produtoCodigo = produtoCodigo;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.inativo = inativo;
	}


	public Long getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}


	public Long getProdutoCodigo() {
		return produtoCodigo;
	}


	public void setProdutoCodigo(Long produtoCodigo) {
		this.produtoCodigo = produtoCodigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getPrecoCusto() {
		return precoCusto;
	}


	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}


	public Double getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}


	public Boolean getInativo() {
		return inativo;
	}


	public void setInativo(Boolean inativo) {
		this.inativo = inativo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(descricao, idProduto, inativo, precoCusto, precoVenda, produtoCodigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkProdutos other = (LinkProdutos) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(idProduto, other.idProduto)
				&& Objects.equals(inativo, other.inativo) && Objects.equals(precoCusto, other.precoCusto)
				&& Objects.equals(precoVenda, other.precoVenda) && Objects.equals(produtoCodigo, other.produtoCodigo);
	}


	@Override
	public String toString() {
		return "LinkProdutos [idProduto=" + idProduto + ", produtoCodigo=" + produtoCodigo + ", descricao=" + descricao
				+ ", precoCusto=" + precoCusto + ", precoVenda=" + precoVenda + ", inativo=" + inativo + "]";
	}


	
	
	
	
	
	
}
