/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author User
 */
public class TesteEscrita3 {
    // public static void main(String[] args) throws IOException {
        
        /*OutputStream fos = new FileOutputStream("lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);*/

        
        /* Para ter acesso ao método newLine, 
        você pode voltar a utilizar o BufferedWriter 
        para a escrita no arquivo, passando para ele o FileWriter criado anteriormente:
        BufferedWriter bw = new BufferedWriter(new FileWriter("testeFileWriter.txt"));*/
       /* FileWriter fw = new FileWriter("testeFileWriter.txt");
        fw.write("Exemplo com a biblioteca FileWriter, que pode ser usada de um modo mais simples");
        fw.write(System.lineSeparator());
        fw.write("do que nas usadas anteriormente");
       
       
        fw.close();
       
        
        
    } */
}
