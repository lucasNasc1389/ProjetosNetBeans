/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author lucas
 */
public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";
        
        ArrayList<String> aulas = new ArrayList<>();
        
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
        System.out.println(aulas);
        
        aulas.remove(0);
        
        System.out.println(aulas);
        
        
        // Lê-se: para cada String aula dentro de aulas, faça...
        for(String aula : aulas) {
            System.out.println("Aula: " + aula); 
        }
        
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: "+ primeiraAula);
        
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i));
        }
        
        // Lê-se: para cada aula dentro de aulas, faça...
        aulas.forEach(aula -> {
            System.out.println("percorrendo: ");
            System.out.println("aula: " + aula);
        });
        
        
        aulas.add("Aumentando o nosso conhecimento");
        System.out.println(aulas);
        
        // Método sort() faz a ordenação natural da nossa lista
        Collections.sort(aulas);
        
        aulas.add("Depois de ordenando: ");
        System.out.println(aulas);
        
    }
}
