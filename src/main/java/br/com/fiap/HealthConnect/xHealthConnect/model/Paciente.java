package br.com.fiap.HealthConnect.xHealthConnect.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_paciente")
	private Integer id;
	
	@Column(name = "nome_paciente", length = 50, nullable = true)
	private String nome;
	
	@Column(name = "email_paciente", length = 50, nullable = true)
	private String email;
	
	@Column(name = "tel_paciente", length = 15, nullable = true)
	private String telefone;
	
	@Column(name = "genero_paciente", length = 10, nullable = true)
	private String genero;
	
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}