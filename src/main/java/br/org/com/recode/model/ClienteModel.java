package br.org.com.recode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cliente;
	private String nome_cliente;
	private String cpf;
	private int telefone_cliente;
	private String email_cliente;
	private String senha_cliente;
	
	public ClienteModel() {
	}

	public ClienteModel(long id_cliente, String nome_cliente, String cpf, int telefone_cliente, String email_cliente,
			String senha_cliente) {
		super();
		this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
		this.telefone_cliente = telefone_cliente;
		this.email_cliente = email_cliente;
		this.senha_cliente = senha_cliente;
	}

	public ClienteModel(String nome_cliente, String cpf, int telefone_cliente, String email_cliente,
			String senha_cliente) {
		super();
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
		this.telefone_cliente = telefone_cliente;
		this.email_cliente = email_cliente;
		this.senha_cliente = senha_cliente;
	}

	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone_cliente() {
		return telefone_cliente;
	}

	public void setTelefone_cliente(int telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getSenha_cliente() {
		return senha_cliente;
	}

	public void setSenha_cliente(String senha_cliente) {
		this.senha_cliente = senha_cliente;
	}

	@Override
	public String toString() {
		return "ClienteModel [id_cliente=" + id_cliente + ", nome_cliente=" + nome_cliente + ", cpf=" + cpf
				+ ", telefone_cliente=" + telefone_cliente + ", email_cliente=" + email_cliente + ", senha_cliente="
				+ senha_cliente + "]";
	}

	
	
	
}
	
	