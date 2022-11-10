package br.com.fiap.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpresaDBManager {
	
	public static Connection obterConexao() {
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm95652", "241089");
			
			System.out.println("conectado");
		} catch (SQLException e) {
			System.err.println("N�o foi poss�vel conectar no banco de dados");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC n�o foi encontrado!");
			e.printStackTrace();
		}
		return conexao;
	}

}
