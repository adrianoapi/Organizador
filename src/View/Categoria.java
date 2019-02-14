package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.List;
import java.sql.SQLException;
import java.awt.BorderLayout;

import View.Conexao;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Categoria {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Categoria window = new Categoria();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public Categoria() throws SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		String  sql = "SELECT * FROM chronos.tb_pessoa LIMIT 10";
		Conexao con = new Conexao();
		con.conexao();
		con.executeSQL(sql);
		
		
		
		List myList = new List();
		frame.getContentPane().add(myList, BorderLayout.CENTER);
		
		myList.add("Object 1");
		myList.add("Object 2");
		myList.add("Object 3");
		myList.add("Object 4");
		myList.add("Object 5");
		myList.add("Object 6");
		myList.add("Object 7");
		myList.add("Object 8");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 1");
		myList.add("Object 2");
		myList.add("Object 3");
		myList.add("Object 4");
		myList.add("Object 5");
		myList.add("Object 6");
		myList.add("Object 7");
		myList.add("Object 8");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 1");
		myList.add("Object 2");
		myList.add("Object 3");
		myList.add("Object 4");
		myList.add("Object 5");
		myList.add("Object 6");
		myList.add("Object 7");
		myList.add("Object 8");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 1");
		myList.add("Object 2");
		myList.add("Object 3");
		myList.add("Object 4");
		myList.add("Object 5");
		myList.add("Object 6");
		myList.add("Object 7");
		myList.add("Object 8");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		myList.add("Object 9");
		
		
	}

}
