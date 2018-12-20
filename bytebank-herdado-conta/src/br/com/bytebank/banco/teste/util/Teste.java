/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Teste {
    public static void main(String[] args) {
        
       int idade = 29;
       Integer idadeRef = Integer.valueOf(29); //Autoboxing
        System.out.println(idadeRef.doubleValue());
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        System.out.println(Integer.SIZE);
        
        int valor = idadeRef.intValue();//Unboxing
        String s = args[0];
        int numero = Integer.parseInt(s);
        System.out.println(numero);
        
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);
        
        
    }
}
