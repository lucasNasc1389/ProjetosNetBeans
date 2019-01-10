/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.lucas.leilao.Lance;
import br.com.lucas.leilao.Leilao;
import br.com.lucas.leilao.Usuario;
import br.com.lucas.leilao.servico.Avaliador;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class TesteDoAvaliador {
    // para que o jUnit entenda o método de teste temos que mudar a assinatura
    // o método não pode ser estatico e nem receber argumentos
    // Também deve ser anotado com @Test
    
    private Avaliador leiloeiro;
    
    private void criaAvaliador() {
        Avaliador leiloeiro = new Avaliador();
    }
    
    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        // Parte 1: Cenário
        Usuario huguinho = new Usuario("Huguinho");
        Usuario luizinho = new Usuario("Luizinho");
        Usuario zezinho = new Usuario("zezinho");
        
        Leilao leilao = new Leilao("Playstation 3 novo.");
        
        leilao.propoe(new Lance(huguinho, 250));
        leilao.propoe(new Lance(luizinho, 300.0));
        leilao.propoe(new Lance(zezinho, 400.0));
        
        // parte 2: ação
        criaAvaliador();
        leiloeiro.avalia(leilao);
        
        // parte 3: Validação
        double maiorEsperado = 400;
        double menorEsperado = 250;
        
     //   System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
        assertEquals(maiorEsperado,leiloeiro.getMaiorLance(), 0.00001);
       // System.out.println(menorEsperado == leiloeiro.getMenorDeTodos());
        assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.00001);
    }
    
    @Test
    public void deveEntenderLeilaoComApenasUmLance() {
        Usuario django = new Usuario("Django");
        Leilao leilao = new Leilao("SuperFamicom com 100 cartuchos");
        
        leilao.propoe(new Lance(django, 1000.00) );
        
        criaAvaliador();
        leiloeiro.avalia(leilao);
        
        assertEquals(1000.0, leiloeiro.getMaiorLance(), 0.00001);
        assertEquals(1000.0, leiloeiro.getMenorDeTodos(), 0.00001);
    } 
    
    @Test
    public void deveEncontrarOsTresMaioresLances() {
        Usuario jason = new Usuario("Jason");
        Usuario fred = new Usuario("Fred");
        Leilao leilao = new Leilao("SegaDreamcast na caixa com 4 controles + 1 game");
        
        leilao.propoe(new Lance(jason, 1250.0));
        leilao.propoe(new Lance(fred, 2550.0));
        leilao.propoe(new Lance(jason, 2650.0));
        leilao.propoe(new Lance(fred, 2850.0));
        leilao.propoe(new Lance(jason, 3050.0));
        leilao.propoe(new Lance(fred, 3150.0));
        leilao.propoe(new Lance(jason, 3500.0));
        leilao.propoe(new Lance(fred, 4100.0));
        leilao.propoe(new Lance(jason, 4500.0));
        
        criaAvaliador();
        leiloeiro.avalia(leilao);
        
        List<Lance> maiores = leiloeiro.getTresMaiores();
        
        assertEquals(3, maiores.size());
        assertEquals(4500.0, maiores.get(0).getValor(), 0.00001);
        assertEquals(4100.0, maiores.get(1).getValor(), 0.00001);
        assertEquals(3500.0, maiores.get(2).getValor(), 0.00001);
    }
    
    @Test
    public void deveEncontrarEmOrdemAleatoria() {
        Usuario anakin = new Usuario("Anakin");
        Usuario yoda = new Usuario("Yoda");
        
        Leilao leilao = new Leilao("Sabre de luz da grow série limitada");
        
        leilao.propoe(new Lance(anakin, 400));
        leilao.propoe(new Lance(yoda, 150));
        leilao.propoe(new Lance(anakin, 260));
        leilao.propoe(new Lance(yoda, 120));
        leilao.propoe(new Lance(anakin, 700));
        leilao.propoe(new Lance(yoda, 330));
        
        criaAvaliador();
        leiloeiro.avalia(leilao);
        
        assertEquals(700, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(120, leiloeiro.getMenorDeTodos(), 0.0001);
        
    }
    
     
    
    
}