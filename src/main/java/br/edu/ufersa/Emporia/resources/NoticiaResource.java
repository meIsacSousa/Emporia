package br.edu.ufersa.Emporia.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ufersa.Emporia.models.Noticia;
import br.edu.ufersa.Emporia.repository.NoticiaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Emporia - API")
@CrossOrigin(origins="*")
public class NoticiaResource {

	@Autowired
	NoticiaRepository noticiaRepository;
	
	@GetMapping("/noticias")
	@ApiOperation(value="Retorna uma lista de noticias")
	public List<Noticia> index () {
		return noticiaRepository.findAll();
	}
	
	@GetMapping("/noticias/{id}")
	@ApiOperation(value="Retorna uma única noticias")
	public Noticia show (@PathVariable(value="id") long id) {
		return noticiaRepository.findById(id);
	}
	
	@PostMapping("/noticias")
	@ApiOperation(value="Adiciona uma nova noticia")
	public Noticia store (@RequestBody Noticia noticia) {
		return noticiaRepository.save(noticia);
	}
	
	@DeleteMapping("/noticias")
	@ApiOperation(value="Remove uma noticia")
	public void destroy (@RequestBody Noticia noticias) {
		noticiaRepository.delete(noticias);
	}
	
	@PutMapping("/noticias")
	@ApiOperation(value="Atualiza uma noticia")
	public Noticia update(@RequestBody Noticia noticia) {
		return noticiaRepository.save(noticia);
	}
	
}
