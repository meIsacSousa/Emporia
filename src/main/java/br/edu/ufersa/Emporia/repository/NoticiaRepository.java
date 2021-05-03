package br.edu.ufersa.Emporia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.Emporia.models.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {

	Noticia findById(long id);
	
}
