package br.edu.ufersa.Emporia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.Emporia.models.Casa;


public interface CasaRepository extends JpaRepository<Casa, Long> {

	Casa findById(long id);
	
}
