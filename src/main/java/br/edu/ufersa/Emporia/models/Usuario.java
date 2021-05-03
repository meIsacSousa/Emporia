package br.edu.ufersa.Emporia.models;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="TB_USUARIO")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private String email;
	private String senha;
	private String numero;
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Noticia> noticias;
	
	@ManyToMany
	@JoinTable(name="corretores_casas", joinColumns=
	{@JoinColumn(name="id_usuario", referencedColumnName="id")}, inverseJoinColumns=
	{@JoinColumn(name="id_casa", referencedColumnName="id")})
	private List<Casa> casas;
	
	@ManyToMany
	@JoinTable(name="corretores_residenciais", joinColumns=
	{@JoinColumn(name="id_usuario", referencedColumnName="id")}, inverseJoinColumns=
	{@JoinColumn(name="id_residencial", referencedColumnName="id")})
	private List<Residencial> residenciais;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
