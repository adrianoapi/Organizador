package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	
	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	void conexao(){
		
		url     = "jdbc:postgresql://localhost:5432/chronos_track";
		usuario = "chronos";
		senha   = "chronos"; 
		
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
//			String  sql = "SELECT * FROM chronos.tb_pessoa LIMIT 1";
//			PreparedStatement stmt = con.prepareStatement(sql);
//			ResultSet rs = stmt.executeQuery();
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+"\n");
//			}

			JOptionPane.showMessageDialog(null,  "Conectado com sucesso!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void executeSQL(String sql) throws SQLException {
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
				
		while(rs.next()) {
			System.out.println(rs.getInt("pessoa_id")+ " - " + rs.getString("pessoa_nome") +" \n ");
		}
	}
	
	

}
