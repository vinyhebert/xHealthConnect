package br.com.fiap.HealthConnect.xHealthConnect.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.fiap.HealthConnect.xHealthConnect.model.Paciente;

public interface PacienteDAO extends CrudRepository<Paciente, Integer> {

}
