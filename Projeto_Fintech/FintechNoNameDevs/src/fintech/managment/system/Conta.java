package fintech.managment.system;

public class Conta {

	private int numero;
	private int agencia;
	private double saldo;
	
	
	public Conta (int numero, int agencia, double saldo){
		
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = 0;
	}
	
	public int getNumero() {
		
		return numero;
	}
	
	public void setNumero(int numero){
		
		this.numero = numero;
	}
	
	public int getAgencia() {
			
			return agencia;
		}
	
	public void setAgencia(int agencia){
		
		this.agencia = agencia;
	}
	
	public double getSaldo() {
			
		return saldo;
	}

	
}
