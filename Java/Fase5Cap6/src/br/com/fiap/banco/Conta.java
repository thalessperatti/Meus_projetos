package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai um Conta Banc�ria
 * @author <h3>Thales Speratti</h3>
 * @version <h3>1.0</h3>
 */
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * N�mero da conta
	 */
	private int numero;
	
	/**
	 * N�mero da Ag�ncia
	 */
	private int agencia;
	
	/**
	 * Saldo da conta
	 */
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, double saldo) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.saldo = saldo;
	}
	
	/**
	 * Acrescenta valor ao saldo da conta
	 * @param valor que ser� depositado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}
