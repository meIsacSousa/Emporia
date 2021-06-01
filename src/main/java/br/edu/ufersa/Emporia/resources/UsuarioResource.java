package br.edu.ufersa.Emporia.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import br.edu.ufersa.Emporia.models.Usuario;
import br.edu.ufersa.Emporia.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Emporia - API")
@CrossOrigin(origins="*")
public class UsuarioResource {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	@ApiOperation(value="Retorna uma lista de usuários")
	public List<Usuario> index () {
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuarios/{id}")
	@ApiOperation(value="Retorna um único usuário")
	public Usuario show (@PathVariable(value="id") long id) {
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/usuarios")
	@ApiOperation(value="Adiciona um novo usuário")
	public Usuario store (@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@PostMapping("/usuarios/login")
	@ApiOperation(value="Faz autenticação")
	public String store (@RequestBody Usuario usuario, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            return "signup";
        }
        return "success";
	}
	
	@DeleteMapping("/usuarios")
	@ApiOperation(value="Remove um usuário")
	public void destroy (@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	@PutMapping("/usuarios")
	@ApiOperation(value="Atualiza um usuário")
	public Usuario update (@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@GetMapping("/usuarios/nome/{nome}")
	@ApiOperation(value="Retorna um único usuário")
	public Usuario show (@PathVariable(value="nome") String nome) {
		return usuarioRepository.findByNomeContainingIgnoreCase(nome);
	}
}
