package br.edu.ufersa.Emporia.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity()
@Table(name="tb_casa")
public class Casa extends Imovel {
	private static final long serialVersionUID = 1L;
	
	private boolean venda;
	private boolean aluguel;
	private int quartos;
	private int suites;
	private double areaUtil;
	private double areaTotal;
	private double valorVenda;
	private double valorAluguel;
	@ManyToMany(mappedBy="casas")
	private List<Usuario> corretores;
	
	public boolean isVenda() {
		return venda;
	}
	
	public void setVenda(boolean venda) {
		this.venda = venda;
	}
	
	public boolean isAluguel() {
		return aluguel;
	}
	
	public void setAluguel(boolean aluguel) {
		this.aluguel = aluguel;
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
	
	public double getAreaUtil() {
		return areaUtil;
	}
	
	public void setAreaUtil(double areaUtil) {
		this.areaUtil = areaUtil;
	}
	
	public double getAreaTotal() {
		return areaTotal;
	}
	
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
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
	
	
}
