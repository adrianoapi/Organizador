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
import java.awt.event.ActionEvent;

import View.ViewHome;
import javax.swing.SwingConstants;


public class ViewLogin {

	private JFrame frame;
	private JTextField textLogin;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 */
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textLogin = new JTextField();
		textLogin.setBounds(144, 78, 217, 37);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(144, 126, 217, 37);
		frame.getContentPane().add(textPassword);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogin.setBounds(55, 81, 79, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(55, 129, 81, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkLogin(textLogin.getText(), new String(textPassword.getPassword()))) {
					
					JOptionPane.showMessageDialog(null,  "Autenticado com sucesso!");
					
					frame.setVisible(false);
					ViewHome info = new ViewHome();
					ViewHome.main(null);
					
//					JFrame newFrame = new JFrame();
//					newFrame.setVisible(true);


		            
					
				}else {
					JOptionPane.showMessageDialog(null, "Login ou senha incorrenta!");
				}
				
			}
		});
		btnEntrar.setBounds(272, 174, 89, 37);
		frame.getContentPane().add(btnEntrar);
	}
	
	public boolean checkLogin(String login, String password){
		return login.contentEquals("admin") && password.contentEquals("123");
	}
	
}
