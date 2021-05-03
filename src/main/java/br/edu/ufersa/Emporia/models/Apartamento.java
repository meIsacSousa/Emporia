package br.edu.ufersa.Emporia.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name="tb_partamento")
public class Apartamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String descricao;
	private double area;
	private double valorVenda;
	private double valorAluguel;
	private boolean aluguel;
	private boolean venda;
	private int numero;
	private int andar;
	private int quartos;
	private int suites;
	private int vagasGaragem;
	@ManyToOne
	@JoinColumn(name="id_residencial")
	private Residencial residencial;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getValorVenda() {
		return valorVenda;
	}
	
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	public double getValorAluguel() {
		return valorAluguel;
	}
	
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public boolean isAluguel() {
		return aluguel;
	}
	
	public void setAluguel(boolean aluguel) {
		this.aluguel = aluguel;
	}
	
	public boolean isVenda() {
		return venda;
	}
	
	public void setVenda(boolean venda) {
		this.venda = venda;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAndar() {
		return andar;
	}
	
	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public int getQuartos() {
		return quartos;
	}
	
	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}
	
	public int getSuites() {
		return suites;
	}
	
	public void setSuites(int suites) {
		this.suites = suites;
	}
	
	public int getVagasGaragem() {
		return vagasGaragem;
	}
	
	public void setVagasGaragem(int vagasGaragem) {
		this.vagasGaragem = vagasGaragem;
	}

	public Residencial getResidencial() {
		return residencial;
	}

	public void setResidencial(Residencial residencial) {
		this.residencial = residencial;
	}
		
}
