/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lucas
 */
public class TestaAlunos {
    public static void main(String[] args) {
      //Collection<String> alunos = new HashSet<>(); (O collection poderia ser usado direto)
        Set<String> alunos = new HashSet<>();
        alunos.add("Lucas Nascimento");
        alunos.add("Luan Santos");
        alunos.add("Chiquinho");
        alunos.add("Dunha");
        alunos.add("Vitor Nascimentos");
        alunos.add("Axl Rose");
        alunos.add("Falcão");
        alunos.add("Vitor Nascimentos");
        
        
        boolean LucasEstamatriculado = alunos.contains("Pedro");
        
        
        
        // Lê-se: para cada String aluno dentro de alunos, faça... 
        for(String aluno : alunos) {
             System.out.println(aluno);
        }
        
        System.out.println(" ");
        System.out.println(alunos);
         System.out.println(" ");
         
        // Lê-se: para cada aluno dentro de alunos, faça... 
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        
        System.out.println("");
        System.out.println(LucasEstamatriculado);
        alunos.remove("Lucas Nascimento");
        System.out.println("");
        System.out.println(alunos);
        System.out.println("");
        
        List<String>alunosEmLista = new ArrayList<>(alunos);
        
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        
        
        
        
        
       
        
    }
}
