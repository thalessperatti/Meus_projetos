package br.com.fiap.transacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacao {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Connection conexao = null;
		
		int idProduto = 1015;
		int qtdProdutosParaTransferir = 5;
		int idArmazemOrigem = 1;
		int idArmazemDestino = 2;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm95652", "241089");
			
			//desabilita o autocommit
			conexao.setAutoCommit(false);
			
			//primeira transa��o - atualiza o estoque do armazem 1
			PreparedStatement stmt = conexao.prepareStatement("UPDATE T_CAP8_ESTOQUE SET QT_PRODUTO = QT_PRODUTO - ?"
																+ "WHERE CD_PRODUTO = ? AND CD_ARMAZEM = ?"	);
			stmt.setInt(1, qtdProdutosParaTransferir);		//cinco produtos
			stmt.setInt(2, idProduto);						//com o c�digo 1015
			stmt.setInt(3, idArmazemOrigem);				//do armazem 1
			
			//segunda transa��o - atualiza o estoque do armazem 2
			PreparedStatement stmt2 = conexao.prepareStatement("UPDATE T_CAP8_ESTOQUE SET QT_PRODUTO = QT_PRODUTO + ?"
																+ "WHERE CD_PRODUTO = ? AND CD_ARMAZEM = ?");
			stmt2.setInt(1, qtdProdutosParaTransferir);		//cinco produtos
			stmt2.setInt(2, idProduto);						//com o c�digo 1015
			stmt2.setInt(3, idArmazemDestino);				//para o armazem 2
			stmt2.executeUpdate();
			
			//efetiva as duas transa��es
			conexao.commit();
			
			//imprime se der tudo certo
			System.out.println("05 produtos 1015 foram transferidos do armaz�m 1 para o 2");
		} catch (SQLException se) {
			//n�o efetiva as duas transa��es
			conexao.rollback();
			System.out.println("Os 05 produtos 1015 n�o foram trasnferidos do armaz�m 1 para o 2");
			se.printStackTrace();
		}
	}

}
