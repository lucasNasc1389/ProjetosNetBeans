/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 *
 * @author lucas
 */
public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();
    
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
    
    public int getTempoTotal() {
            int tempoTotal = 0;
            for(Aula aula : aulas) {
                tempoTotal += aula.getTempo();
            }
            return tempoTotal;
        }

    @Override
    public String toString() {
        return "[Curso " + nome + ", tempo total: "+ this.getTempoTotal()  +"," + " aulas: " + this.aulas + " ]";
    }

    void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }
    
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    /*Aluno buscaMatriculado(int numero) {
       for(Aluno aluno : alunos){
           if(aluno.getNumeroMatricula() == numero)
               return aluno;
       }
        throw new NoSuchElementException("Matricula não encontrada");
    
    }*/
    
    public Aluno buscaMatriculado(int numero) {
        return matriculaParaAluno.get(numero);
       }
        
}
