package br.com.fiap.HealthConnect.xHealthConnect.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_consulta")
	private Integer id;

	@Column(name = "motivo_consulta", length = 50, nullable = true)
	private String motivo;
	
	@JoinColumn(name = "cd_profissional")
	@ManyToOne
	private Profissional profissional;
	
	@JoinColumn(name = "cd_paciente")
	@ManyToOne
	private Paciente paciente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
