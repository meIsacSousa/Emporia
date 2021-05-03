package br.edu.ufersa.Emporia.models;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_CORRETOR")
public class Corretor extends Usuario {
	private static final long serialVersionUID = 1L;
	
	
	private String creci;

	public String getCreci() {
		return creci;
	}

	public void setCreci(String creci) {
		this.creci = creci;
	}
	
}
