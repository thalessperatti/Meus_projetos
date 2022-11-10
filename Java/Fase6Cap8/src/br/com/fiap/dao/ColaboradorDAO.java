package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import br.com.fiap.bean.Colaborador;
import br.com.fiap.jdbc.EmpresaDBManager;

public class ColaboradorDAO {
	
	private Connection conexao;
	
	public void cadastrar(Colaborador colaborador) {
		PreparedStatement stmt = null;
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			String sql = "INSERT INTO T_CAP8_COLABORADOR (CD_COLABORADOR, NM_COLABORADOR, DS_EMAIL,"
							+ "VL_SALARIO, DT_CONTRATACAO) VALUES (SEQ_COLABORADOR.NEXTVAL, ?,?,?,?)";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, colaborador.getNome());
			stmt.setString(2, colaborador.getEmail());
			stmt.setDouble(3, colaborador.getSalario());
			java.sql.Date data = new java.sql.Date(colaborador.getDataContratacao().getTimeInMillis());
			stmt.setDate(4, data);
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public List<Colaborador> listar() {
		//cria uma lista de colaboradores
		List<Colaborador> lista = new ArrayList<Colaborador>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_CAP8_COLABORADOR");
			rs = stmt.executeQuery();
			
			//percorre todos os registros encontrados
			while(rs.next()) {
				int codigo = rs.getInt("cd_colaborador");
				String nome = rs.getString("nm_colaborador");
				String email = rs.getString("ds_email");
				double salario = rs.getDouble("vl_salario");
				java.sql.Date data = rs.getDate("dt_contratacao");
				Calendar dataContratacao = Calendar.getInstance();
				dataContratacao.setTimeInMillis(data.getTime());
				//cria um objeto colaborador com as informações encontradas
				Colaborador colaborador = new Colaborador(codigo, nome, email, salario, dataContratacao);
				//adiciona o colaborador na lista
				lista.add(colaborador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}
	
	
	public void remover(int codigo) {
		PreparedStatement stmt = null;
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			String sql = "DELETE FROM T_CAP8_COLABORADOR WHERE CD_COLABORADOR = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public Colaborador buscarPorId() {
		Colaborador colaborador = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo do colaborador: ");
		int codigoBusca = sc.nextInt();
		
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_CAP8_COLABORADOR WHERE CD_COLABORADOR = ?");
			stmt.setInt(1, codigoBusca);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int codigo = rs.getInt("cd_colaborador");
				String nome = rs.getString("nm_colaborador");
				String email = rs.getString("ds_email");
				double salario = rs.getDouble("vl_salario");
				java.sql.Date data = rs.getDate("dt_contratacao");
				Calendar dataContratacao = Calendar.getInstance();
				dataContratacao.setTimeInMillis(data.getTime());
				colaborador = new Colaborador(codigo, nome, email, salario, dataContratacao);
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return colaborador;
	}
	
	
	public void atualizar(Colaborador colaborador) {
		PreparedStatement stmt = null;
		
		try {
			conexao = EmpresaDBManager.obterConexao();
			String sql = "UPDATE T_CAP8_COLABORADOR SET NM_COLABORADOR = ?, DS_EMAIL = ?, VL_SALARIO = ?,"
							+ "DT_CONTRATACAO = ? WHERE CD_COLABORADOR = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, colaborador.getNome());
			stmt.setString(2, colaborador.getEmail());
			stmt.setDouble(3, colaborador.getSalario());
			java.sql.Date data = new java.sql.Date(colaborador.getDataContratacao().getTimeInMillis());
			stmt.setDate(4, data);
			stmt.setInt(5, colaborador.getCodigo());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
