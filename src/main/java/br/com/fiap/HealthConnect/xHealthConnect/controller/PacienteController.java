package br.com.fiap.HealthConnect.xHealthConnect.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.HealthConnect.xHealthConnect.DAO.PacienteDAO;
import br.com.fiap.HealthConnect.xHealthConnect.model.Paciente;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	PacienteDAO dao;

	@GetMapping
	public List<Paciente> listaPacientes() {
	return (List<Paciente>) dao.findAll();
	}
	
	@PostMapping
	public Paciente criarPaciente(@RequestBody Paciente paciente) {
		Paciente pacienteNovo = dao.save(paciente);
		return pacienteNovo;
	}
	
	@PutMapping
	public Paciente alterarPaciente(@RequestBody Paciente paciente) {
		Paciente pacienteNovo = dao.save(paciente);
		return pacienteNovo;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Paciente> excluirPaciente(@PathVariable Integer id) {
		Optional<Paciente> paciente = dao.findById(id);
		dao.deleteById(id);
		return paciente;
	}
	
}
