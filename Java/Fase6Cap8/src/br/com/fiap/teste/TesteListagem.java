package br.com.fiap.teste;

import br.com.fiap.bean.Colaborador;
import br.com.fiap.dao.ColaboradorDAO;
import java.util.List;

public class TesteListagem {
	
	public static void main(String[] args) {
		
		ColaboradorDAO dao = new ColaboradorDAO();
		
		List<Colaborador> lista = dao.listar();
			for (Colaborador item : lista) {
				System.out.println(item.getCodigo() + " " + item.getNome() + " " + item.getEmail() + " " + item.getSalario() + " " + item.getDataContratacao().getTime());
			}
	}

}
