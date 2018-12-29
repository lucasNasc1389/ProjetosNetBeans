/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author User
 */
public class TesteCopiarArquivo {
      public static void main(String[] args) throws IOException {
        //Fluxo de entrada com um arquivo
        
        // Padrão decorator
        InputStream file = System.in; //  FileInputStream("lorem.txt") - Aqui ele pega um arquivo .txt pronto
        InputStreamReader isr = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(isr);
        
        OutputStream fos = System.out; // new FileOutputStream("escritaAleatória.txt"); Aqui ele cria um novo arquivo .txt
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
        String linha = br.readLine();
        
        while(linha != null && !linha.isEmpty()) {
           bw.write(linha);
           bw.newLine();
           bw.flush(); // Esse método devolve o fluxo que fica guardado no BufferedWriter();
           linha = br.readLine();
        }
        
        br.close();
        bw.close();
        
        
    }
}
