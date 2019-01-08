/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author User
 */
public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
       /* Cliente cliente = new Cliente();
        cliente.setNome("Lucas Nascimento");
        cliente.setProfissao("Desenvolvedor");
        cliente.setCpf("353.917.458-37");
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cliente.bin"));
        oos.writeObject(cliente);
        oos.close();*/
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCpf());
    }
}