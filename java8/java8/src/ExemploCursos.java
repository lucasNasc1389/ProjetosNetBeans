
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
 class Curso {
    private String nome;
    private int alunos;
    
    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
    
    
}

public class ExemploCursos {
    public static void main(String[] args) {
        
        List<Curso> cursos = new ArrayList<Curso>();
    
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));
        
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        
       //cursos.forEach(c -> System.out.println(c.getAlunos()));
        
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(c -> c.getAlunos())
                .forEach(total -> System.out.println(total));
               
                
        
         
        
        
        
        }
}