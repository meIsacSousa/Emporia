package br.edu.ufersa.Emporia.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ufersa.Emporia.ShellSort;
import br.edu.ufersa.Emporia.models.Apartamento;
import br.edu.ufersa.Emporia.repository.ApartamentoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Emporia - API")
@CrossOrigin(origins="*")
public class ApartamentoResource {

	@Autowired
	ApartamentoRepository  apartamentoRepository;
	
	@GetMapping("/apartamentos")
	@ApiOperation(value="Retorna uma lista de apartamentos")
	public List<Apartamento> index () {
		return apartamentoRepository.findAll();
	}
	
	@GetMapping("/apartamentos/{id}")
	@ApiOperation(value="Retorna um único apartamento")
	public Apartamento show (@PathVariable(value="id") long id) {
		return apartamentoRepository.findById(id);
	}
	
	@PostMapping("/apartamentos")
	@ApiOperation(value="Adiciona um novo apartamento")
	public Apartamento store (@RequestBody Apartamento apartamento) {
		return apartamentoRepository.save(apartamento);
	}
	
	@DeleteMapping("/apartamentos")
	@ApiOperation(value="Remove um apartamento")
	public void destroy (@RequestBody Apartamento apartamento) {
		apartamentoRepository.delete(apartamento);
	}
	
	@PutMapping("/apartamentos")
	@ApiOperation(value="Atualiza um apartamento")
	public Apartamento update(@RequestBody Apartamento apartamento) {
		return apartamentoRepository.save(apartamento);
	}
	
	//============================================================================
	
	@GetMapping("/apartamentos/venda")
	@ApiOperation(value="Retorna apartamentos a venda")
	public List<Apartamento> venda (boolean venda) {
		return apartamentoRepository.findByVenda(true);
	}
	
	@GetMapping("/apartamentos/aluguel")
	@ApiOperation(value="Retorna apartamentos alugáveis")
	public List<Apartamento> aluguel (boolean aluguel) {
		return apartamentoRepository.findByAluguel(true);
	}
	
}
