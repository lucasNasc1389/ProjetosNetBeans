/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
}

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }
    
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
    
    
}
