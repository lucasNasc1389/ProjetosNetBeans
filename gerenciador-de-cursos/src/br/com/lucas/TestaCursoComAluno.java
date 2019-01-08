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
public class TestaCursoComAluno {
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
        
         System.out.println("todos os alunos matriculado nesse curso: ");
            javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
            });
        
        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        
        System.out.println("");
        
        Aluno lucas = new Aluno("Lucas Nascimento", 3472);
        System.out.println("E esse Lucas, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(lucas));
        System.out.println("");
        
        System.out.println("O a1 é equals ao Lucas?");
        System.out.println(a1.equals(lucas));
        
        System.out.println("");
        
        System.out.println(a1.hashCode() == lucas.hashCode());
            
         
            
            
    }
}
