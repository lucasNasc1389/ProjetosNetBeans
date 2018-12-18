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
        Conta minhaConta = new Conta(5330,969060);
        Cliente lucas = new Cliente();
        
        lucas.setNome("Lucas Nascimento");
        minhaConta.setTitular(lucas);
        System.out.println(minhaConta.getTitular().getNome());
        
    }
}
