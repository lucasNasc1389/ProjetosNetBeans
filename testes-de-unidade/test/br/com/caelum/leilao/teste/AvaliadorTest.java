package br.com.caelum.leilao.teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import br.com.caelum.leilao.servico.Avaliador;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class AvaliadorTest {
    
    @Test
    public void main() {
        // parte 1: cenario
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario lucas = new Usuario("Lucas");
        
        Leilao leilao = new Leilao("Playstation 4 novo");
        
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(lucas,400.0));
        
        
        // parte 2: acão
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        // parte 3: validação
        double maiorEsperado = 400;
        double menorEsperado = 250;
        
        
       //System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
       //System.out.println(menorEsperado == leiloeiro.getMenorLance());
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
       
    }


    
}
