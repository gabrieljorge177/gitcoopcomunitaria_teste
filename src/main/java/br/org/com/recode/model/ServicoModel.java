package br.org.com.recode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Servico")
public class ServicoModel {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_servico;
	private String nome_do_servico;
	private String categoria;
	private double preco;
	
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private ClienteModel c1;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa")
	private EmpresaModel e1;
	
	public ServicoModel() {
	}

	public ServicoModel(long id_servico, String nome_do_servico, String categoria, double preco, ClienteModel c1,
			EmpresaModel e1) {
		super();
		this.id_servico = id_servico;
		this.nome_do_servico = nome_do_servico;
		this.categoria = categoria;
		this.preco = preco;
		this.c1 = c1;
		this.e1 = e1;
	}

	public ServicoModel(String nome_do_servico, String categoria, double preco, ClienteModel c1, EmpresaModel e1) {
		super();
		this.nome_do_servico = nome_do_servico;
		this.categoria = categoria;
		this.preco = preco;
		this.c1 = c1;
		this.e1 = e1;
	}

	

	public long getId_servico() {
		return id_servico;
	}

	public void setId_servico(long id_servico) {
		this.id_servico = id_servico;
	}

	public String getNome_do_servico() {
		return nome_do_servico;
	}

	public void setNome_do_servico(String nome_do_servico) {
		this.nome_do_servico = nome_do_servico;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ClienteModel getC1() {
		return c1;
	}

	public void setC1(ClienteModel c1) {
		this.c1 = c1;
	}

	public EmpresaModel getE1() {
		return e1;
	}

	public void setE1(EmpresaModel e1) {
		this.e1 = e1;
	}

	@Override
	public String toString() {
		return "ServicoModel [id_servico=" + id_servico + ", nome_do_servico=" + nome_do_servico + ", categoria="
				+ categoria + ", preco=" + preco + ", c1=" + c1 + ", e1=" + e1 + "]";
	}
	
}
