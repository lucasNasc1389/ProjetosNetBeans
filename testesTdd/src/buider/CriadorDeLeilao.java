package buider;

import br.com.lucas.leilao.Lance;
import br.com.lucas.leilao.Leilao;
import br.com.lucas.leilao.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class CriadorDeLeilao {

    private Leilao leilao;

    public CriadorDeLeilao para(String descricao) {
        this.leilao = new Leilao(descricao);
        return null;
    }
    
    public CriadorDeLeilao lance(Usuario usuario, double valor) {
        leilao.propoe(new Lance(usuario, valor));
        return this;
    }
    
    public Leilao constroi(){
        return leilao;
    }

    
    
}
