/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.leilao.teste;

import br.com.lucas.leilao.Lance;
import br.com.lucas.leilao.Leilao;
import br.com.lucas.leilao.Usuario;
import br.com.lucas.leilao.servico.Avaliador;

/**
 *
 * @author lucas
 */
public class TesteDoavaliador {
    public static void main(String[] args) {
        Usuario joao = new Usuario("Huguinho");
        Usuario luizinho = new Usuario("Luizinho");
        Usuario zezinho = new Usuario("zezinho");
        
        Leilao leilao = new Leilao("Playstation 3 novo.");
        
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(luizinho, 300.0));
        leilao.propoe(new Lance(zezinho, 400.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        System.out.println(leiloeiro.getMaiorLance());
        System.out.println(leiloeiro.getMenorDeTodos());
    }
}
