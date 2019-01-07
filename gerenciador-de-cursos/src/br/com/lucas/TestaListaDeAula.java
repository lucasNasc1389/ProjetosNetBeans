/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author lucas
 */
public class TestaListaDeAula {
    public static void main(String[] args) {
        
        Aula a1 = new Aula("Revisitando a ArraysLists", 21);
        Aula a2 = new Aula("Listas de objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 20);
        
        ArrayList<Aula> aulas =  new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        
        System.out.println(aulas);
        
        Collections.sort(aulas);
        
        System.out.println(aulas);
        
        aulas.sort(Comparator.comparing(Aula::getTempo));
        
        System.out.println(aulas);
        
        
        
    }
}
