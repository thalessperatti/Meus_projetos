package br.com.fiap.teste;

import br.com.fiap.bean.Colaborador;
import br.com.fiap.dao.ColaboradorDAO;

public class TesteAlteracao {
	
	public static void main(String[] args) {
		
		ColaboradorDAO dao = new ColaboradorDAO();
		//recupera o colaborador com código digitado
		Colaborador colaborador = dao.buscarPorId();
		//imprime os valores do colaborador
		System.out.println(colaborador.getCodigo() + " "
							+ colaborador.getNome() + " "
							+ colaborador.getEmail() + " "
							+ colaborador.getSalario() + " "
							+ colaborador.getDataContratacao().getTime());
		//altera os valores de alguns atributos do colaborador
		colaborador.setSalario(1500);
		colaborador.setEmail("teste@fiap.com.br");
		//atualiza no banco de dados
		dao.atualizar(colaborador);
	}

}
