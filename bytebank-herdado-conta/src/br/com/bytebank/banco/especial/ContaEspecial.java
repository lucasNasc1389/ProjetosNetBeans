/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

/**
 *
 * @author User
 */
public class ContaEspecial extends Conta {
    
    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.getSaldo();
    }
    
    
}
