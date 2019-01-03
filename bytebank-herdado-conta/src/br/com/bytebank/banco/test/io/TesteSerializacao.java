/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author User
 */
public class TesteSerializacao {
    /*public static void main(String[] args) throws FileNotFoundException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas");
        cliente.setProfissao("Dev");
        cliente.setCpf("35391745837");
        
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(222.3);
        cc.setTitular(cliente);
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }*/
}
