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

import br.com.fiap.HealthConnect.xHealthConnect.DAO.ConsultaDAO;
import br.com.fiap.HealthConnect.xHealthConnect.model.Consulta;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	
	@Autowired
	ConsultaDAO dao;
	
	@GetMapping
	public List<Consulta> listaConsultas() {
		return (List<Consulta>) dao.findAll();
		}
	
	@PostMapping
	public Consulta criarConsulta(@RequestBody Consulta consulta) {
		Consulta consultaNovo = dao.save(consulta);
		return consultaNovo;
	}
	
	@PutMapping
	public Consulta alterarConsulta(@RequestBody Consulta consulta) {
		Consulta consultaNovo = dao.save(consulta);
		return consultaNovo;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Consulta> excluirConsulta(@PathVariable Integer id) {
		Optional<Consulta> consulta = dao.findById(id);
		dao.deleteById(id);
		return consulta;
	}
}
