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
public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        String nome = "Lucas Nascimento";
        
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        
        oos.writeObject(nome);
        oos.close();*/
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto"));
        
        String name = (String) ois.readObject();
        ois.close();
        System.out.println(name);
    }
}