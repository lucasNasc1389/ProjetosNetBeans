/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.leilao.servico;

import br.com.lucas.leilao.Lance;
import br.com.lucas.leilao.Leilao;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Avaliador {

    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;
    private List<Lance> maiores;
    
    public void avalia(Leilao leilao) {
       
        for(Lance lance : leilao.getLances()){
            if (lance.getValor() > maiorDeTodos) {
                maiorDeTodos = lance.getValor(); 
            } if (lance.getValor() < menorDeTodos){
                menorDeTodos = lance.getValor();
            }
            
            maiores = new ArrayList<>(leilao.getLances());
            Collections.sort(maiores, new Comparator<Lance>() {
                @Override
                public int compare(Lance o1, Lance o2) {
                    if (o1.getValor() < o2.getValor())  return 1;
                    if (o1.getValor() > o2.getValor())  return -1;
                    return 0;
                 }
            });
             maiores = maiores.subList(0,maiores.size() > 3 ? 3 : maiores.size());
        }
        
        
    }

    public double getMaiorLance() {
        return maiorDeTodos;
    }

    public double getMenorDeTodos() {
        return menorDeTodos;
    }

    public List<Lance> getTresMaiores() {
        return maiores;
    }
    
    
    
    
}
