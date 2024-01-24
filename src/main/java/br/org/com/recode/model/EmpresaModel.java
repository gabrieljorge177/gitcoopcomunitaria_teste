package br.org.com.recode.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class EmpresaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_empresa;
	private String nome_empresa;
	private String codigo_cadastro;
	private int telefone_empresa;
	private String email_empresa;
	private String senha;
	
	
	
	public EmpresaModel() {
	
	}

	public EmpresaModel(long id_empresa, String nome_empresa, String codigo_cadastro, int telefone_empresa,
			String email_empresa, String senha) {
		super();
		this.id_empresa = id_empresa;
		this.nome_empresa = nome_empresa;
		this.codigo_cadastro = codigo_cadastro;
		this.telefone_empresa = telefone_empresa;
		this.email_empresa = email_empresa;
		this.senha = senha;
	}

	public EmpresaModel(String nome_empresa, String codigo_cadastro, int telefone_empresa, String email_empresa,
			String senha) {
		super();
		this.nome_empresa = nome_empresa;
		this.codigo_cadastro = codigo_cadastro;
		this.telefone_empresa = telefone_empresa;
		this.email_empresa = email_empresa;
		this.senha = senha;
	}

	public long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getNome_empresa() {
		return nome_empresa;
	}

	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}

	public String getCodigo_cadastro() {
		return codigo_cadastro;
	}

	public void setCodigo_cadastro(String codigo_cadastro) {
		this.codigo_cadastro = codigo_cadastro;
	}

	public int getTelefone_empresa() {
		return telefone_empresa;
	}

	public void setTelefone_empresa(int telefone_empresa) {
		this.telefone_empresa = telefone_empresa;
	}

	public String getEmail_empresa() {
		return email_empresa;
	}

	public void setEmail_empresa(String email_empresa) {
		this.email_empresa = email_empresa;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "EmpresaModel [id_empresa=" + id_empresa + ", nome_empresa=" + nome_empresa + ", codigo_cadastro="
				+ codigo_cadastro + ", telefone_empresa=" + telefone_empresa + ", email_empresa=" + email_empresa
				+ ", senha=" + senha + "]";
	}
	
}