/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.ContaCorrente;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author User
 */
public class TesteDeSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ClassNotFoundException {
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente cc =  (ContaCorrente) ois.readObject();
                ois.close();
                System.out.println(cc.getSaldo());
                System.out.println(cc.getTitular().getNome());
    }
}
