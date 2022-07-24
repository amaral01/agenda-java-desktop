package dev.soberana.amaral.UI;

import java.awt.EventQueue;
import java.awt.Dimension;

import java.awt.event.MouseListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import dev.soberana.amaral.engine.WidGet;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;

import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadPessoa extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pnSoulth;
	private JPanel pnNorth;
	private JButton btnSave;	
	private JButton btnConsult; 
	private JButton btnDelete;
	private JButton btnClear;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	//Id
	private JPanel pnId;
	private JLabel lbId;
	private JTextField tfId;
	
	//Name
	private JPanel pnName;
	private JLabel lbName;
	private JTextField tfName;
	
	//Address
	private JPanel pnAdress;
	private JLabel lbAdress;
	private JTextField tfAdress;
	
	//City
	private JPanel pnCity;
	private JLabel lbCity;
	private JTextField tfCity;	
	//Zip code
	
	private JPanel pnZipCode;
	private JLabel lbZipCode;
	private JTextField tfZipCode;

	//cellPhone
	private JPanel pnCellPhone;
	private JLabel lbCellPhone;
	private JTextField tfCellPhone;
	
	private JPanel pnCpf;
	private JLabel lbCpf;
	private JTextField tfCpf;

	//Cnpj
	private JPanel pnCnpj;
	private JLabel lbCnpj;
	private JTextField tfCnpj;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadPessoa frame = new CadPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void init() {
		this.pnName = new JPanel();
		this.lbName = new  JLabel();
		this.tfName = new JTextField();
		
		//Address
		this.pnAdress = new JPanel();
		this.lbAdress = new JLabel();
		this.tfAdress = new JTextField();
		
		//City
		this.pnCity =  new JPanel();;
		this.lbCity= new JLabel();;
		this.tfCity =new JTextField();
		//Zip code
		
		this.pnZipCode=  new JPanel();;
		this.lbZipCode= new JLabel();;
		this.tfZipCode=new JTextField();

		//cellPhone
		this.pnCellPhone=  new JPanel();;
		this.lbCellPhone= new JLabel();;
		this.tfCellPhone=new JTextField();
		
		this.pnCpf=  new JPanel();;
		this.lbCpf= new JLabel();;
		this.tfCpf=new JTextField();

		//Cnpj
		this.pnCnpj=  new JPanel();;
		this.lbCnpj= new JLabel();;
		this.tfCnpj=new JTextField();
		
	}
	public CadPessoa() {
		setTitle("Cadastro Pessoa");
		
		init();
		
		// criando widgets
		WidGet widget = new WidGet (this);
		widget.create(pnName,lbId,tfId,"Id");
		
		widget.create(pnAdress,lbAdress,tfAdress,"Endereço");
		widget.create(pnCity,lbCity,tfCity,"Cidade");
		widget.create(pnZipCode,lbZipCode,tfZipCode,"CEP");
		widget.create(pnZipCode,lbZipCode,tfZipCode,"CNPJ");
		
		
		setVisible(true);
		setClosable(true);
		setBounds(0, 0, 1366, 710);//Choose 1366 x 768
		
		JPanel pnSoulth = new JPanel();
		getContentPane().add(pnSoulth, BorderLayout.SOUTH);
		JPanel pnNorth = new JPanel();
		getContentPane().add(pnNorth, BorderLayout.NORTH);
		
		pnSoulth.setSize(1366,50);
		
		pnNorth.setSize(1366,50);
		this.btnSave = new JButton("Salvar");
		
		pnSoulth.add(btnSave, BorderLayout.NORTH);
		this.btnConsult = new JButton("Consultar");
		
		pnSoulth.add(btnConsult, BorderLayout.NORTH);
		this.btnDelete = new JButton("Excluir");
		
		pnSoulth.add(btnDelete, BorderLayout.NORTH);
		this.btnClear = new JButton("Limpar");
		
		pnSoulth.add(btnClear, BorderLayout.NORTH);
		//ID
		pnId = new JPanel();
		getContentPane().add(pnId, BorderLayout.CENTER);
		
		lbId= new JLabel("Id");
		pnId.add(lbId);
		
		tfId = new JTextField();
		pnId.add(tfId);
		tfId.setColumns(10);
		
		//Name
		pnName = new JPanel();
		getContentPane().add(pnName, BorderLayout.CENTER);
				
		lbName= new JLabel("Id");
		pnName.add(lbId);
				
		tfName= new JTextField();
		pnName.add(tfId);
		tfName.setColumns(10);
		
		//evento de Clicar
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Salvar","Aviso", JOptionPane.INFORMATION_MESSAGE);								
			}
		});
		
		btnConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Consultar","Aviso",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Deletando","Aviso",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Limpando","Aviso",JOptionPane.INFORMATION_MESSAGE);
			}
		});	
		
		
		BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI());
		for(MouseListener listener:basicInternalFrameUI.getNorthPane().getMouseListeners()) {
			basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
			
		}

	}

}
