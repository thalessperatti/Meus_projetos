package fintech.managment.system;

public class TransacaoReceita extends Transacao {
	
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public TransacaoReceita(double valor) {
		this.setValor(valor);
	}
	
	public double depositar (double valor) {

		return super.getSaldo() + valor;	
		}		
}
