package fintech.managment.system;

public class Telefone {		
		
	private int prefixo;
	private int numero;	
	
	public Telefone (int prefixo, int numero) {
		
		this.prefixo = prefixo;
		this.numero = numero;
	}
	
	public String getTelefone () {
		
		return novoTelefone(prefixo, numero);
	}
	
	private String novoTelefone (int prefixo, int numero) {
		
		return "(" + prefixo + ")" + numero;
	}
}
