package br.edu.ufersa.Emporia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.Emporia.models.Residencial;

public interface ResidencialRepository extends JpaRepository<Residencial, Long> {

	Residencial findById(long id);

	List<Residencial> findByBairroContainingIgnoreCase(String bairro);

	List<Residencial> findByCep(String cep);
	
}
