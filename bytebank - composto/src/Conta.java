/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Conta{
    
    double saldo;
    int agencia;
    int numero;
    Cliente titular;
    
    void deposito(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " efetuado com sucesso");
    }
    
    public boolean saca(double valor) {
        double saldoAnterior = this.saldo;
        
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Seu saldo anterior era: " + saldoAnterior);
            System.out.println("Seu saldo atual é: " + this.saldo);
            return true;
        }else {
            System.out.println("Você não possui saldo suficiente para saque :(");
            return false;
        } 
    }
    
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposito(valor);
            System.out.println("Transferencia de " + valor + " efetuada com sucesso!");
            return true;
        }
            return false;

    }
}
