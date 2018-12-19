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
public class Teste {
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        
        Conta cc1 = new ContaCorrente(555, 124578);
        lista.add(cc1);
       
       Conta cp2 = new ContaPoupanca(478, 895623);
       lista.add(cp2);
       
        System.out.println(lista.size());
        
        Conta ref = (Conta) lista.get(0);
        
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        
        System.out.println("Tamanho " + lista.size());
        
        Conta cc3 = new ContaCorrente(897, 661122);
        lista.add(cc3);
        
        Conta cp4 = new ContaPoupanca(111, 324321);
        lista.add(cp4);
        
        for (int i = 0; i < lista.size(); i++) {
            Object oref = lista.get(i);
            System.out.println(oref);
        }
        
        
        
        
        
        
    }
}
