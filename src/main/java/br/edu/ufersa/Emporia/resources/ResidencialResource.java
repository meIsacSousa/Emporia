package br.edu.ufersa.Emporia.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ufersa.Emporia.models.Casa;
import br.edu.ufersa.Emporia.models.Residencial;
import br.edu.ufersa.Emporia.repository.ResidencialRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Emporia - API")
@CrossOrigin(origins="*")
public class ResidencialResource {
	
	@Autowired
	ResidencialRepository residencialRepository;
	
	@GetMapping("/residenciais")
	@ApiOperation(value="Retorna uma lista de residenciais")
	public List<Residencial> index () {
		return residencialRepository.findAll();
	}
	
	@GetMapping("/residenciais/{id}")
	@ApiOperation(value="Retorna um único residencial")
	public Residencial show (@PathVariable(value="id") long id) {
		return residencialRepository.findById(id);
	}
	
	@PostMapping("/residenciais")
	@ApiOperation(value="Adiciona um novo residencial")
	public Residencial store (@RequestBody Residencial residencial) {
		return residencialRepository.save(residencial);
	}
	
	@DeleteMapping("/residenciais")
	@ApiOperation(value="Remove um residencial")
	public void destroy (@RequestBody Residencial residencial) {
		residencialRepository.delete(residencial);
	}
	
	@PutMapping("/residenciais")
	@ApiOperation(value="Atualiza um residencial")
	public Residencial update(@RequestBody Residencial residencial) {
		return residencialRepository.save(residencial);
	}
	
	//===================================================================
	
	@GetMapping("/residenciais/bairro/{bairro}")
	@ApiOperation(value="Retorna residenciais buscando pela rua")
	public List<Residencial> bairro (@PathVariable(value="bairro") String bairro) {
		return residencialRepository.findByBairroContainingIgnoreCase(bairro);
	}
	
	@GetMapping("/residenciais/cep/{cep}")
	@ApiOperation(value="Retorna residenciais buscando pelo cep")
	public List<Residencial> cep (@PathVariable(value="cep") String cep) {
		return residencialRepository.findByCep(cep);
	}

}
