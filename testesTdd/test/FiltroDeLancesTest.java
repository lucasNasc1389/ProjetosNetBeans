
import br.com.lucas.leilao.Lance;
import br.com.lucas.leilao.Usuario;
import br.com.lucas.leilao.teste.FiltroDeLances;
import java.util.Arrays;
import java.util.List;
import static junit.framework.Assert.assertEquals;
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
public class FiltroDeLancesTest {
    @Test
    public void deveSelecionarLancesEntre1000E3000() {
        Usuario joao = new Usuario("Joao");

        FiltroDeLances filtro = new FiltroDeLances();
        List<Lance> resultado = filtro.filtra(Arrays.asList(
                new Lance(joao,2000), 
                new Lance(joao,1000), 
                new Lance(joao,3000), 
                new Lance(joao, 800)));

        assertEquals(1, resultado.size());
        assertEquals(2000, resultado.get(0).getValor(), 0.00001);
    }

    @Test
    public void deveSelecionarLancesEntre500E700() {
        Usuario joao = new Usuario("Joao");

        FiltroDeLances filtro = new FiltroDeLances();
        List<Lance> resultado = filtro.filtra(Arrays.asList(
                new Lance(joao,600), 
                new Lance(joao,500), 
                new Lance(joao,700), 
                new Lance(joao, 800)));

        assertEquals(1, resultado.size());
        assertEquals(600, resultado.get(0).getValor(), 0.00001);
    }
    
    @Test
    public void deveSelecionarLancesMaioresQue5000() {
        Usuario seya = new Usuario("Seya");
        
        FiltroDeLances filtro = new FiltroDeLances();
        List<Lance> resultado = filtro.filtra(Arrays.asList(
                new Lance(seya,5100), 
                new Lance(seya,150), 
                new Lance(seya,55), 
                new Lance(seya, 80)));
        
        assertEquals(1, resultado.size());
        assertEquals(5100, resultado.get(0).getValor(), 0.00001);
    }
    
    @Test
    public void deveEliminarLancesMenoresQue500(){
        Usuario seya = new Usuario("Seya");
        
        FiltroDeLances filtro = new FiltroDeLances();
        List<Lance> resultado = filtro.filtra(Arrays.asList(
                new Lance(seya,10), 
                new Lance(seya,500), 
                new Lance(seya,700), 
                new Lance(seya,5000)));
        
        assertEquals(0, resultado.size());
    }
    
    @Test
    public void deveEliminarLancesEntre3000E5000(){
        Usuario seya = new Usuario("Seya");
        
        FiltroDeLances filtro = new FiltroDeLances();
        List<Lance> resultado = filtro.filtra(Arrays.asList(
                new Lance(seya,4000), 
                new Lance(seya,500), 
                new Lance(seya,700), 
                new Lance(seya,5000)));
        
        assertEquals(0, resultado.size());
    }
}
