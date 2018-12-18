/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String[] args){
        
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();
        
        quadrado.rotate();
        circulo.playSound();
    }
}
