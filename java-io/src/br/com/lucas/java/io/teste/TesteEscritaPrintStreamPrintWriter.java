/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;


/**
 *
 * @author User
 */
public class TesteEscritaPrintStreamPrintWriter {
        public static void main(String[] args) throws IOException {
        /* O PrintStream não possui o método write e sim o método print.
        Ele também não tem o método newLine, então no caso de precisar 
        pular uma linha após ela ser escrita, há o método println:*/
        PrintStream ps = new PrintStream("PrintStream_PrintWriter.txt");
        
        ps.println("Exemplo com a biblioteca PrintStream.");
        ps.print("do que nas usadas anteriormente");
       
       
        ps.close();
       
        
        
    } 
}
