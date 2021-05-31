package br.edu.ufersa.Emporia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ufersa.Emporia.models.Casa;


public interface CasaRepository extends JpaRepository<Casa, Long> {

	Casa findById(long id);
	
	List<Casa> findByBairroContainingIgnoreCase(String bairro);
	List<Casa> findByVenda(boolean venda);
	List<Casa> findByAluguel(boolean aluguel);
	List<Casa> findByCep(String cep);
	Casa findByValorVenda(double valorVenda);

}
