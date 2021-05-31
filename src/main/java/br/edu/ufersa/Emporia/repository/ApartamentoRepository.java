package br.edu.ufersa.Emporia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.Emporia.models.Apartamento;
import br.edu.ufersa.Emporia.models.Casa;



public interface ApartamentoRepository extends JpaRepository<Apartamento, Long> {

	Apartamento findById(long id);

	List<Apartamento> findByVenda(boolean venda);

	List<Apartamento> findByAluguel(boolean aluguel);

	
	
}
