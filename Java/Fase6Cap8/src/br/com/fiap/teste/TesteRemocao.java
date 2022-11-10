package br.com.fiap.teste;

import br.com.fiap.dao.ColaboradorDAO;

public class TesteRemocao {
	
	public static void main(String[] args) {
		ColaboradorDAO dao = new ColaboradorDAO();
		//remove o clocaborador com codigo 1
		dao.remover(1);
	}

}
