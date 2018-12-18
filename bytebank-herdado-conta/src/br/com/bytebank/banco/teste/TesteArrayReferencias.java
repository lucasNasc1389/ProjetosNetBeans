/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 *
 * @author lucas
 */
public class TesteArrayReferencias {
    
    public static void main(String[] args) {
        
       ContaCorrente[] contas = new ContaCorrente[10];
       ContaCorrente cc1 = new ContaCorrente(555, 124578);
       contas[0] = cc1;
       
       ContaCorrente cc2 = new ContaCorrente(478, 895623);
       contas[1] = cc2;
       
       ContaCorrente cc3 = new ContaCorrente(478, 745896);
       contas[2] = cc3; 
       
       ContaCorrente ref = contas[2];
       
        System.out.println(contas[1].getNumero());
        System.out.println(contas[2].getNumero());
        System.out.println(ref.getNumero());
       
        
    }
}
