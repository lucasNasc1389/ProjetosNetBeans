/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author User
 */
public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com um arquivo
        
        // Padrão decorator
        OutputStream fos = new FileOutputStream("arquivo2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write("Lucas Nascimento da silva, Bom dia!!!!");
        //bw.newLine();
        bw.newLine();
        bw.write("Testando FileOutputStream");
        
        bw.close();
        
        
    }
}
