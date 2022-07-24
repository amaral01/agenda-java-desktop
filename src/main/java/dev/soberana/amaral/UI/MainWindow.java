package dev.soberana.amaral.UI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class MainWindow {

	private JFrame frame;
	private JInternalFrame newWindow;
	private JDesktopPane desktopPanel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1366, 710);//Choose 1366 x 600
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		
		JMenuItem mItemCadastro = new JMenuItem("Pessoa");
		mItemCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Invocando rotina de cadastro");
				try {
					CadPessoa cadastro = new CadPessoa();
					desktopPanel.add(cadastro);
					desktopPanel.moveToFront(cadastro);

					cadastro.setSize(desktopPanel.getWidth(), desktopPanel.getHeight());
					cadastro.setLocation(0, 0);
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		mnCadastros.add(mItemCadastro);
		
				
		JMenu mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		desktopPanel = new JDesktopPane();
		frame.getContentPane().add(desktopPanel, BorderLayout.CENTER);
		//desktopPanel.setLayout(null);
		
		JMenuItem mItemConsulta = new JMenuItem("Pessoa");
		mItemConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Invocando rotina de Consulta");
				
	
				
				
			}
		});

	}

}
