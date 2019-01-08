/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.lucas.leilao.teste.*;
import br.com.lucas.leilao.Lance;
import br.com.lucas.leilao.Leilao;
import br.com.lucas.leilao.Usuario;
import br.com.lucas.leilao.servico.Avaliador;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class TesteDoavaliador {
    // para que o jUnit entenda o método de teste temos que mudar a assinatura
    // o método não pode ser estatico e nem receber argumentos
    // Também deve ser anotado com @Test
    @Test
    public void main() {
        // Parte 1: Cenário
        Usuario joao = new Usuario("Huguinho");
        Usuario luizinho = new Usuario("Luizinho");
        Usuario zezinho = new Usuario("zezinho");
        
        Leilao leilao = new Leilao("Playstation 3 novo.");
        
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(luizinho, 300.0));
        leilao.propoe(new Lance(zezinho, 400.0));
        
        // parte 2: ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        // parte 3: Validação
        double maiorEsperado = 400;
        double menorEsperado = 250;
        
     //   System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
        Assert.assertEquals(menorEsperado, maiorEsperado, 0.00001);
       // System.out.println(menorEsperado == leiloeiro.getMenorDeTodos());
        Assert.assertEquals(menorEsperado, maiorEsperado, 0.00001);
    }
}