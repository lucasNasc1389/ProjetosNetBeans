/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import buider.CriadorDeLeilao;
import br.com.lucas.leilao.Lance;
import br.com.lucas.leilao.Leilao;
import br.com.lucas.leilao.Usuario;
import br.com.lucas.leilao.servico.Avaliador;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
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
    private Usuario huguinho;
    private Usuario luizinho;
    private Usuario zezinho;
    
    @After
    public void finaliza(){
        System.out.println("fim");
    }
    
    @Before
    public void criaAvaliador() {
       this.leiloeiro = new Avaliador();
       this.huguinho = new Usuario("Huguinho");
       this.luizinho = new Usuario("Luizinho");
       this.zezinho = new Usuario("zezinho");
    }
    
    @Test(expected = RuntimeException.class)
    public void naoDeveAvaliarLeiloesSemNenhumLanceDado() {
        Leilao leilao = new CriadorDeLeilao().para("playstation 3").constroi();
        
        leiloeiro.avalia(leilao);
        
        
    }
    
    @Test
    public void deveEntenderLancesEmOrdemCrescente() {

        Leilao leilao = new Leilao("Playstation 3 novo.");
        
        leilao.propoe(new Lance(huguinho, 250));
        leilao.propoe(new Lance(luizinho, 300.0));
        leilao.propoe(new Lance(zezinho, 400.0));
        
        // parte 2: ação
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
     
        Leilao leilao = new Leilao("SuperFamicom com 100 cartuchos");
        
        leilao.propoe(new Lance(luizinho, 1000.00) );
        

        leiloeiro.avalia(leilao);
        
        assertEquals(1000.0, leiloeiro.getMaiorLance(), 0.00001);
        assertEquals(1000.0, leiloeiro.getMenorDeTodos(), 0.00001);
    } 
    
    @Test
    public void deveEncontrarOsTresMaioresLances() {
        
        Leilao leilao = new CriadorDeLeilao().para("SegaDreamcast na caixa com 4 controles + 1 game")
                .lance(huguinho, 100.0)
                .lance(luizinho, 200.0)
                .lance(huguinho, 300.0)
                .lance(luizinho, 400.0)
                .constroi();
        
                
        leiloeiro.avalia(leilao);
        
        List<Lance> maiores = leiloeiro.getTresMaiores();
        
        assertEquals(3, maiores.size());
        assertEquals(400.0, maiores.get(0).getValor(), 0.00001);
        assertEquals(300.0, maiores.get(1).getValor(), 0.00001);
        assertEquals(200.0, maiores.get(2).getValor(), 0.00001);
    }
    
    @Test
    public void deveEncontrarEmOrdemAleatoria() {
        
        Leilao leilao = new Leilao("Sabre de luz da grow série limitada");
        
        leilao.propoe(new Lance(zezinho, 400));
        leilao.propoe(new Lance(huguinho, 150));
        leilao.propoe(new Lance(zezinho, 260));
        leilao.propoe(new Lance(huguinho, 120));
        leilao.propoe(new Lance(zezinho, 700));
        leilao.propoe(new Lance(huguinho, 330));
        

        leiloeiro.avalia(leilao);
        
        assertEquals(700, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(120, leiloeiro.getMenorDeTodos(), 0.0001);
        
    }
    
     
    
    
}