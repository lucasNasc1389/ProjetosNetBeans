/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.leilao.teste;

import br.com.lucas.leilao.Lance;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class FiltroDeLances {
    
    public List<Lance> filtra(List<Lance> lances) {
        
        ArrayList<Lance> resultado = new ArrayList<Lance>();

        for(Lance lance : lances) {
            if(lance.getValor() > 1000 && lance.getValor() < 3000) 
                    resultado.add(lance);
            else if(lance.getValor() > 500 && lance.getValor() < 700) 
                    resultado.add(lance);
            else if(lance.getValor() > 5000) 
                    resultado.add(lance);
        }

        return resultado;
    }
}
