/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.modelo;

/**
 *
 * @author lucas
 */
public class GuardadorDeContas {
    
        private Object[] referencias;
        private int posicaoLivre;
        
        public GuardadorDeContas() {
            this.referencias = new Object[10];
            this.posicaoLivre = 0;
        }
        
        public void adiciona(Object ref) {
            this.referencias[this.posicaoLivre] = ref;
            this.posicaoLivre++;
}

    public int getQuantidadeDeElementos() {
       return this.posicaoLivre;
    }

    public Object getReferencia(int i) {
            return (Object) this.referencias[i];
       
    }
    }

