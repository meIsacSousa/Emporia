package br.edu.ufersa.Emporia.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import br.edu.ufersa.Emporia.models.Casa;
import br.edu.ufersa.Emporia.ShellSort;
import br.edu.ufersa.Emporia.repository.CasaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Emporia - API")
@CrossOrigin(origins="*")
public class CasaResource {

	@Autowired
	CasaRepository casaRepository;
	
	@GetMapping("/casas")
	@ApiOperation(value="Retorna uma lista de casas")
	public List<Casa> index () {
		return casaRepository.findAll();
	}
	
	@GetMapping("/casas/{id}")
	@ApiOperation(value="Retorna uma única casa")
	public Casa show (@PathVariable(value="id") long id) {
		return casaRepository.findById(id);
	}
	
	@PostMapping("/casas")
	@ApiOperation(value="Adiciona uma nova casa")
	public Casa store (@RequestBody Casa casa) {
		return casaRepository.save(casa);
	}
	
	@DeleteMapping("/casas")
	@ApiOperation(value="Remove uma casa")
	public void destroy (@RequestBody Casa casa) {
		casaRepository.delete(casa);
	}
	
	@PutMapping("/casas")
	@ApiOperation(value="Atualiza uma casa")
	public Casa update(@RequestBody Casa casa) {
		return casaRepository.save(casa);
	}
	
	@GetMapping("/casas/bairro/{bairro}")
	@ApiOperation(value="Retorna casas buscando pela rua")
	public List<Casa> bairro (@PathVariable(value="bairro") String bairro) {
		return casaRepository.findByBairroContainingIgnoreCase(bairro);
	}
	
	@GetMapping("/casas/cep/{cep}")
	@ApiOperation(value="Retorna casas buscando pelo cep")
	public List<Casa> cep (@PathVariable(value="cep") String cep) {
		return casaRepository.findByCep(cep);
	}
	
	
	@GetMapping("/casas/venda")
	@ApiOperation(value="Retorna casas a venda")
	public List<Casa> venda (boolean venda) {
		return casaRepository.findByVenda(true);
	}
	
	@GetMapping("/casas/aluguel")
	@ApiOperation(value="Retorna casas alugáveis")
	public List<Casa> aluguel (boolean aluguel) {
		return casaRepository.findByAluguel(true);
	}
	
	@GetMapping("/casas/menorpreco")
	@ApiOperation(value="Retorna casas de acordo com o seu preço crescente")
	public Casa preco(){
		List<Casa> vvenda = new ArrayList<Casa>();
		ShellSort ss = new ShellSort();
		
		vvenda = casaRepository.findAll();
		Double vec = ss.sort(vvenda);
		
		return casaRepository.findByValorVenda(vec);
	}
	
}
