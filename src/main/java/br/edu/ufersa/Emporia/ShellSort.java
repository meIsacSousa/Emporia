package br.edu.ufersa.Emporia;

import java.util.ArrayList;
import java.util.List;

import br.edu.ufersa.Emporia.models.Casa;

public class ShellSort {
	public Double sort(List<Casa> vvenda){
	
	List<Double> vec = new ArrayList<Double>();
	
	//Criando novo vetor com os preços
	for(int i = 0; i < vvenda.size(); i++) {
		vec.add(i, vvenda.get(i).getValorVenda());
	}
		
		//Shell Sort dos preços
        int n = vec.size();
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i+= 1) {

                double temp = vec.get(i);
                int j;
                for (j = i; j >= gap && vec.get(j-gap) > temp; j -= gap)
                	vec.set(j,vec.get(j-gap));
                vec.set(j,temp);
            }
        }
        
        return vec.get(0); //retorna o menor preço
    }
}
