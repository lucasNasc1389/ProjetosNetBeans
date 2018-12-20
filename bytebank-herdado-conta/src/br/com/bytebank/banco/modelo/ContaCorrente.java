package br.com.bytebank.banco.modelo;



//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	public double getValorImposto() {	
		return super.saldo * 0.01;
	}

    @Override
    public String toString() {
        return "Conta corrente " + super.toString();
    }
        
        
	
}
