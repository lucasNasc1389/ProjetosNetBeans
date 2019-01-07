/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas;

import java.util.List;

/**
 *
 * @author lucas
 */
public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes java", "Paulo Silveira");
        
       
      
        javaColecoes.adiciona(new Aula("Trabalhando com ArrasList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
        
        
        System.out.println(javaColecoes.getAulas());
        
        
        
    }
}
