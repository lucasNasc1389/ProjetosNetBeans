/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

/**
 *
 * @author lucas
 */
public class Teste {
    /*public static void main(String[] args) {
        
        GuardadorDeContas guardador = new GuardadorDeContas();
        
        Conta cc = new ContaCorrente(22, 44);
        guardador.adiciona(cc);
        
        Conta cc2 = new ContaCorrente(55, 77);
        guardador.adiciona(cc2);
        
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas");
        guardador.adiciona(cliente);
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Vitor");
        guardador.adiciona(cliente2);
        
        int tamanho =  guardador.getQuantidadeDeElementos();
        
        System.out.println("Tamanho total" + tamanho);
        
        Conta ref = (Conta) guardador.getReferencia(0);
        Conta ref1 = (Conta) guardador.getReferencia(1);
        Cliente ref2 = (Cliente) guardador.getReferencia(2);
        Cliente ref3 = (Cliente) guardador.getReferencia(3);
        
        System.out.println(ref.getNumero());
        System.out.println(ref1.getNumero());
        System.out.println(ref2.getNome());
        System.out.println(ref3.getNome());
    }*/
    
}
