package br.com.fiap.HealthConnect.xHealthConnect.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_profissional")
public class Profissional {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_profissional")
	private Integer id;
	
	@Column(name = "nome_profissional", length = 50, nullable = true)
	private String nome;
	
	@Column(name = "email_profissional", length = 50, nullable = true)
	private String email;
	
	@Column(name = "especialidade_profissional", length = 50, nullable = true)
	private String especialidade;
	
	@Column(name = "crm_profissional", length = 10, nullable = true)
	private Integer crm;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}
}
