package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import View.ViewHome;
import View.Conexao;
import javax.swing.SwingConstants;
import java.awt.Font;


public class ViewLogin {

	private JFrame frame;
	private JTextField textLogin;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws UnsupportedLookAndFeelException, SQLException {
		
		String  sql = "SELECT * FROM chronos.tb_pessoa LIMIT 10";
		Conexao con = new Conexao();
		con.conexao();
		con.executeSQL(sql);
		
		// Midifica o layout da aplicação
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
        	System.err.println(ex);
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(400, 200, 429, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textLogin = new JTextField();
		textLogin.setBounds(134, 37, 217, 37);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(134, 85, 217, 37);
		frame.getContentPane().add(textPassword);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogin.setBounds(45, 40, 79, 34);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(45, 88, 81, 34);
		frame.getContentPane().add(lblPassword);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkLogin(textLogin.getText(), new String(textPassword.getPassword()))) {
					
					//JOptionPane.showMessageDialog(null,  "Autenticado com sucesso!");
					
					frame.setVisible(false);
					ViewDashboard dashboard = new ViewDashboard();
					ViewDashboard.main(null);
					
					//JFrame newFrame = new JFrame();
					//newFrame.setVisible(true);


		            
					
				}else {
					JOptionPane.showMessageDialog(null, "Login ou senha incorrenta!");
				}
				
			}
		});
		btnEntrar.setBounds(262, 133, 89, 37);
		frame.getContentPane().add(btnEntrar);
	}
	
	public boolean checkLogin(String login, String password){
		return login.contentEquals("admin") && (password.contentEquals("123") || password.contentEquals("admin"));
	}
	
}
