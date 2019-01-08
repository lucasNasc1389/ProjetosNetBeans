
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class OrdenaStrings {
    public static void main(String[] args) {
        
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");
        
        palavras.sort((s1, s2) -> {
                if (s1.length() < s2.length()) 
            return -1;
                if (s1.length() > s2.length()) 
                return 1;
            return 0;
        });
        
       // palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
       
          palavras.sort(Comparator.comparing(s -> s.length()));
     
        
        System.out.println(palavras);
        System.out.println("");
        
       /* Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        
        palavras.forEach(consumidor);
        */
       
        //Poderíamos até mesmo evitar a criação da variável consumidor,
        //passando a classe anônima diretamente para o forEach:
        palavras.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });
        
        // ou então usando Lambda
        palavras.forEach((String s) -> {
            System.out.println(s);
        });
        
        
      new Thread(() -> System.out.println("Executando um runnable")).start();

        
    }
}

 class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) 
            return -1;
        if (s1.length() > s2.length()) 
            return 1;
        return 0;
        
    }
    
}

