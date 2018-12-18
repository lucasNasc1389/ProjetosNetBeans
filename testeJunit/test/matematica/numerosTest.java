/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class numerosTest {
    
    private numeros n;
    
    public numerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = new numeros();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of numeroPar method, of class numeros.
     */
    @Test
    public void testNumeroPar() {
        assertEquals(true, n.numeroPar(4));
    }

    /**
     * Test of areaQuadrado method, of class numeros.
     */
    @Test
    public void testAreaQuadrado() {
        assertEquals(100, n.areaQuadrado(10));
    }

    /**
     * Test of numeroDivisivel method, of class numeros.
     */
    @Test
    public void testNumeroDivisivel() {
        assertEquals(true, n.numeroDivisivel(8, 2));
    }
    
}
