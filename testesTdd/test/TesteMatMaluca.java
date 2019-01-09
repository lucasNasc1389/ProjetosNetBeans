
import br.com.lucas.mat.MatematicaMaluca;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class TesteMatMaluca {
    
    @Test
    public void MaiorQueTrinta() {
        MatematicaMaluca mm = new MatematicaMaluca();  
        int numero = 40;
        int atual = mm.contaMaluca(numero);
        assertEquals(160, atual);
             
    }
    
    @Test
    public void MenorQueTrinta(){
        MatematicaMaluca mm = new MatematicaMaluca();
        int numero = 20;
        int atual = mm.contaMaluca(numero);
        assertEquals(60, atual);
    }
    
    @Test
    public void QualquerNumero(){
        MatematicaMaluca mm = new MatematicaMaluca();
        int numero = 3;
        int atual = mm.contaMaluca(numero);
        assertEquals(3*2, mm.contaMaluca(3));
    }
    
    @Test
    public void deveMultiplicarNumerosMaioresQue30() {
        MatematicaMaluca matematica = new MatematicaMaluca();
        assertEquals(50*4, matematica.contaMaluca(50));
    }

    @Test
    public void deveMultiplicarNumerosMaioresQue10EMenoresQue30() {
        MatematicaMaluca matematica = new MatematicaMaluca();
        assertEquals(20*3, matematica.contaMaluca(20));
    }

    @Test
    public void deveMultiplicarNumerosMenoresQue10() {
        MatematicaMaluca matematica = new MatematicaMaluca();
        assertEquals(5*2, matematica.contaMaluca(5));
    }
}
