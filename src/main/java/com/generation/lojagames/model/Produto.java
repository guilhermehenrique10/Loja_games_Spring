package com.generation.lojagames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message= "O atributo 'nome' é obrigatório!") 
	@Size(min = 5, max = 255, message = "O atributo 'nome' deve ter no mínimo 05 e no máximo 255 caracteres")
	private String nome;
	
	@NotBlank (message= "O atributo 'descricao' é obrigatório!")
	@Size(min = 10, max = 500, message = "O atributo 'descricao' deve ter no mínimo 10 e no máximo 500 caracteres")
	private String descricao;
	
	@Size(min = 1, max = 255, message = "O atributo 'descricao' deve ter no mínimo 1 e no máximo 255 caracteres")
	private String console;
	
	private int quantEstoque;
	
	@NotNull (message= "O atributo 'preço' é obrigatório!")
	@Positive (message= "O valor deve ser maior que zero!")
	private BigDecimal preco;
	
	private String foto;
	
	// RELACIONAMENTO COM A CLASSE CATEGORIA
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	//Get e Set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	//Get e Set do objeto Categoria

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}