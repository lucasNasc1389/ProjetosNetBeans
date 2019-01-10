
import br.com.lucas.leilao.Lance;
import br.com.lucas.leilao.Leilao;
import br.com.lucas.leilao.Usuario;
import junit.framework.Assert;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class TesteLeilao {
    
    @Test
    public void deveReceberUmLance() {
        Leilao leilao = new Leilao("Nintendo64 com 4 controles e 2 cartuchos");
        assertEquals(0, leilao.getLances().size());
        
        leilao.propoe(new Lance(new Usuario("Link"), 2000));
        
        assertEquals(1, leilao.getLances().size());
        assertEquals(2000.0, leilao.getLances().get(0).getValor(), 0.00001);
    }
    
    @Test
    public void deveReceberVariosLances() {
        Leilao leilao = new Leilao("Jaqueta do Chuck Norris");
        Assert.assertEquals(0, leilao.getLances().size());
        
        leilao.propoe(new Lance(new Usuario("Arnold"), 5100));
        leilao.propoe(new Lance(new Usuario("Sylvester"), 5000));
        leilao.propoe(new Lance(new Usuario("JCVD"), 5020));
        leilao.propoe(new Lance(new Usuario("Segal"), 4000));
        
        assertEquals(4, leilao.getLances().size());
        assertEquals(5100, leilao.getLances().get(0).getValor(), 0.00001);
        assertEquals(5000, leilao.getLances().get(1).getValor(), 0.00001);
        assertEquals(5020, leilao.getLances().get(2).getValor(), 0.00001);
        assertEquals(4000, leilao.getLances().get(3).getValor(), 0.00001);
       
    }
    
    @Test
    public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
        Leilao leilao = new Leilao("Anel de criptonita");
        Usuario wayne = new Usuario("Wayne");
        
        leilao.propoe(new Lance(wayne, 2000.0));
        leilao.propoe(new Lance(wayne, 2500.0));
   
       
        assertEquals(1, leilao.getLances().size());
        assertEquals(2000.0, leilao.getLances().get(0).getValor(), 0.00001);
    }
    
    @Test
    public void naoDeveAceitarMaisDoQue5LancesDoMesmoUsuario() {
        Leilao leilao = new Leilao("qualquer coisa");
        Usuario user = new Usuario("user");
        Usuario user2 = new Usuario("user2");
        
        leilao.propoe(new Lance(user, 540.0));
        leilao.propoe(new Lance(user2, 458.0));
        
        leilao.propoe(new Lance(user, 640.0));
        leilao.propoe(new Lance(user2, 658.0));
        
        leilao.propoe(new Lance(user, 740.0));
        leilao.propoe(new Lance(user2, 758.0));
        
        leilao.propoe(new Lance(user, 840.0));
        leilao.propoe(new Lance(user2, 858.0));
        
        leilao.propoe(new Lance(user, 940.0));
        leilao.propoe(new Lance(user2, 958.0));
        
        //Esse lance deve ser ignorado pois cada um pode dar até 5 lances
        leilao.propoe(new Lance(user, 1040.0));
        
        
        assertEquals(10, leilao.getLances().size());
        int ultimo = leilao.getLances().size()-1;
        Lance ultimoLance = leilao.getLances().get(ultimo);
        assertEquals(958.0, ultimoLance.getValor(), 0.00001);
    }
    
    @Test
    public void devoDobrarUltimoLance() {
        Leilao leilao = new Leilao("qualquer coisa");
        Usuario user1 = new Usuario("Lucas");
        Usuario user2 = new Usuario("Vitor");
        
        leilao.propoe(new Lance(user1, 2000));
        leilao.propoe(new Lance(user2, 3000));
        leilao.dobraLance(user1);
        
        assertEquals(4000.0, leilao.getLances().get(2).getValor(), 0.00001);
    }
    
    @Test
    public void naoDeveDobrarCasoNaoHajaLanceAnterior() {
         Leilao leilao = new Leilao("qualquer coisa");
         Usuario user1 = new Usuario("Lucas");
         
         leilao.dobraLance(user1);
         
         assertEquals(0, leilao.getLances().size());
         
    }
    
}
