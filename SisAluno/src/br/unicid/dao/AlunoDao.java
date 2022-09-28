package br.unicid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.unicid.bean.Aluno;
import br.unicid.util.ConnectionFactory;

public class AlunoDao {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private Aluno aluno;
	
	
	public AlunoDao() throws Exception {
		
		try {
			
			this.conn = ConnectionFactory.getConnection();	
			
		}catch(Exception e){
			
			throw new Exception("erro \n" + e.getMessage());
		}
		
	}
	// botão salvar
	public void salvar (Aluno aluno) throws Exception {
		
		if (aluno== null)
			throw new Exception ("O valor passado não pode ser nulo");
		
		try {
			
			String SQL = "INSERT INTO  tb_aluno (rgm, nome, email"
					+ "dataNAscimento, endereço) values (?,?,?,?,?)";
			
			conn = this.conn;
			ps= conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRgm());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.setDate(4,new java.sql.Date(aluno.getDataNascimento().getTime()));
			ps.setString(5, aluno.getEndereço());
			ps.executeUpdate();	
			
		}catch (SQLException sqle) {
			
			throw new Exception ("Erro ao inserir dados" + sqle);			
		}finally {
			
			ConnectionFactory.closeConnection(conn,ps);
		}
	}
	// botão atualizar
public void Atualizar (Aluno aluno) throws Exception {
		
		if (aluno== null)
			throw new Exception ("O valor passado não pode ser nulo");
		
		try {
			
			String SQL = "UPDATE  tb_aluno  set nome=?, email=?,dataNAscimento=?"
					+ " endereço =? where rgm=?";
			
			conn = this.conn;
			ps = conn.prepareStatement(SQL);
			
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getEmail());
			ps.setDate(3,new java.sql.Date(aluno.getDataNascimento().getTime()));
			ps.setString(4, aluno.getEndereço());
			ps.setInt(5, aluno.getRgm());
			ps.executeUpdate();	
			
		}catch (SQLException sqle) {
			
			throw new Exception ("Erro ao inserir dados" + sqle);			
		}finally {
			
			ConnectionFactory.closeConnection(conn,ps);
		}
	
	
	
	}
}
