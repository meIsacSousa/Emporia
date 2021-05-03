package br.edu.ufersa.Emporia.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ufersa.Emporia.models.Casa;
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
	
	
}
