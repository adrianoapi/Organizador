package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import memoria.Principal;

public class ViewDashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDashboard window = new ViewDashboard();
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
	public ViewDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Cadastro");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmCategorias = new JMenuItem("Categorias");
		mnNewMenu_1.add(mntmCategorias);
		
		JMenuItem mntmItem = new JMenuItem("Itens");
		mnNewMenu_1.add(mntmItem);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//frame.setVisible(false);
				Principal principal = new Principal();
				principal.setVisible(true);
				Principal.main(null);
			}
		});
		mnPerfil.add(mntmSair);
		
		JMenuItem mntmAlterarSenha = new JMenuItem("Configuracoes");
		mnPerfil.add(mntmAlterarSenha);
	}
}
