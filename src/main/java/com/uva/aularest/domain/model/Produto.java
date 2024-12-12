package com.uva.aularest.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import javax.persistence.Entity; o prof usou esse

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name ="nome")
	private String nome;
	
	@Column(name ="categoria")
	private Integer categoria;
	
	@Column(name ="loja_fisica")
	private String temLojaFisica;
	
	@Column(name ="quantidade")
	private Integer quantidade;
	
	@Column(name ="preco")
	private Float preco;
	
	@Column(name ="data_validade")
	private String dataValidade;
	
	@Column(name ="descricao")
	private String descricao;
	
	
	public Produto() {
		super();
	}


	public Produto(Integer codigo, String nome, Integer categoria, String temLojaFisica, Integer quantidade,
			Float preco, String dataValidade, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.temLojaFisica = temLojaFisica;
		this.quantidade = quantidade;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.descricao = descricao;
	}


	public Produto(String nome, Integer categoria, String temLojaFisica, Integer quantidade, Float preco,
			String dataValidade, String descricao) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.temLojaFisica = temLojaFisica;
		this.quantidade = quantidade;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.descricao = descricao;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getCategoria() {
		return categoria;
	}


	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}


	public String getTemLojaFisica() {
		return temLojaFisica;
	}


	public void setTemLojaFisica(String temLojaFisica) {
		this.temLojaFisica = temLojaFisica;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Float getPreco() {
		return preco;
	}


	public void setPreco(Float preco) {
		this.preco = preco;
	}


	public String getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", categoria=" + categoria + ", temLojaFisica="
				+ temLojaFisica + ", quantidade=" + quantidade + ", preco=" + preco + ", dataValidade=" + dataValidade
				+ ", descricao=" + descricao + "]";
	}
	
	
	
}
