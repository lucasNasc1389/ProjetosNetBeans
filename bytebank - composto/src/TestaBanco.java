/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class TestaBanco {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.cpf = "222.222.222.22";
        lucas.nome = "Lucas Nascimento";
        lucas.profissao = "programador";
        
        Conta contaDoLucas = new Conta();
        contaDoLucas.deposito(500);
        
        contaDoLucas.titular = lucas;
        System.out.println(contaDoLucas.titular.nome);
        System.out.println(contaDoLucas.titular);
        System.out.println(lucas);
    }
}
