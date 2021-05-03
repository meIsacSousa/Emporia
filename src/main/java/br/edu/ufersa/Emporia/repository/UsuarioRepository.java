package br.edu.ufersa.Emporia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.Emporia.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findById(long id);
	
}
