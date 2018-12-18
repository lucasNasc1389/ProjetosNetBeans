/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class TestaMetodo {
    public static void main(String[] args) {
        
        Conta minhaConta = new Conta();
        Conta contaTerceiro = new Conta();
        
        minhaConta.deposito(200);
        System.out.println("Saldo atual: " + minhaConta.saldo);
        minhaConta.saca(100);
        
        minhaConta.transfere(400, contaTerceiro);
        
        minhaConta.titular = "Lucas Nascimento";
    }
}
