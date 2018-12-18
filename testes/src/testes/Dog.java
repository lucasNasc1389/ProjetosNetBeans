/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author User
 */
public class Dog {
    public String nome;
    
    
    public void bark(){
        System.out.println(this.nome + " diz Ruff,Ruff!");
    }
    
    public void eat(){
        System.out.println("Hora de comer!");
    }
    
    public void chaseCat(){
        System.out.println(this.nome + " Corra!Pegue!");
    }
}
