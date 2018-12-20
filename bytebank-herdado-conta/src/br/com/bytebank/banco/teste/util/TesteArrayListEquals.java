/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TesteArrayListEquals {
    public static void main(String[] args) {
        //ArrayList só armazena referencias do tipo Conta
        // Caso não tivesse  <conta> guardaria qualquer tipo de objeto
        //Generics
        ArrayList<Conta> lista = new ArrayList();
        
        Conta cc1 = new ContaCorrente(555, 124578);
        lista.add(cc1);
       
       Conta cc2 = new ContaCorrente(22, 22);
       lista.add(cc2);
       
       Conta cc3 = new ContaCorrente(22,22);
       
       boolean existe = lista.contains(cc3);
       
        System.out.println("já existe? " + existe);
        
        for(Conta conta : lista) {
            if(conta.equals(cc3)){
            System.out.println("Já tenho essa conta");
            }else{
                System.out.println("Ainda não tenho essa conta");
            }
        }
       
        System.out.println("-------------------");
        
        for(Conta conta : lista) {
            System.out.println(conta);
        }
    
       
    }
}
