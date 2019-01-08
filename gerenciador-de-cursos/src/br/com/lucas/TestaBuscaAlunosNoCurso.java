/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas;

/**
 *
 * @author lucas
 */
public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes java", "Paulo Silveira");
 
        javaColecoes.adiciona(new Aula("Trabalhando com ArrasList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        
        Aluno a1 =new Aluno("Lucas Nascimento", 3472);
        Aluno a2 =new Aluno("Vitor nascimento", 3477);
        Aluno a3 =new Aluno("rico Salamar", 4548);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Quem é o aluno com matricula 4548?");
        Aluno aluno = javaColecoes.buscaMatriculado(4548);
        System.out.println(aluno);
        
    }
}
