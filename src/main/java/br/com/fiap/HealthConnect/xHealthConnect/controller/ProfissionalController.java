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

import br.com.fiap.HealthConnect.xHealthConnect.DAO.ProfissionalDAO;
import br.com.fiap.HealthConnect.xHealthConnect.model.Profissional;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController {

	@Autowired
	ProfissionalDAO dao;
	
	@GetMapping
	public List<Profissional> listaProfissionais() {
	return (List<Profissional>) dao.findAll();
	}
	
	@PostMapping
	public Profissional criarProfissional(@RequestBody Profissional profissional) {
		Profissional profissionalNovo = dao.save(profissional);
		return profissionalNovo;
	}
	
	@PutMapping
	public Profissional alterarProfissional(@RequestBody Profissional profissional) {
		Profissional profissionalNovo = dao.save(profissional);
		return profissionalNovo;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Profissional> excluirProfissional(@PathVariable Integer id) {
		Optional<Profissional> profissional = dao.findById(id);
		dao.deleteById(id);
		return profissional;
	}
}
