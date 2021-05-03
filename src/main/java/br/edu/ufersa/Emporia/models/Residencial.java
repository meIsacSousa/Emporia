package br.edu.ufersa.Emporia.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity()
@Table(name="tb_residencial")
public class Residencial extends Imovel {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int andares;
	
	@OneToMany(mappedBy = "residencial")
	private Set<Apartamento> apartamentos;
	@ManyToMany(mappedBy="residenciais")
	private List<Usuario> corretores;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAndares() {
		return andares;
	}
	public void setAndares(int andares) {
		this.andares = andares;
	}
	public Set<Apartamento> getApartamentos() {
		return apartamentos;
	}
	public void setApartamentos(Set<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}
	
}
