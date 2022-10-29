package fintech.managment.system;

public class TransacaoDespesas extends Transacao {
	
	public double retirar (double valor) {
		
		return super.getSaldo() - valor;
	
	}
}
