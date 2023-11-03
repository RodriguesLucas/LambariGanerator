package br.com.unisc.project.frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class SecondInterface {

	private JFrame frmLambariGeneretor;
	private JTextField textInfo;
	private JTextArea textAreaLogin;
	private JTextArea textAreaPassword;
	private JButton btnGeneretor;
	private JLabel lblNewLabel;
	private JTextField textDate;
	private JLabel lblDate;
	private JTextField textSurname;
	private JLabel lblSurname;
	private JTextField textName;
	private JLabel lblName;
	private JLabel lblLogin;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondInterface window = new SecondInterface();
					window.frmLambariGeneretor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SecondInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLambariGeneretor = new JFrame();
		frmLambariGeneretor.setResizable(false);
		frmLambariGeneretor.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\icon_app.png"));
		frmLambariGeneretor.setTitle("Lambari Generetor");
		frmLambariGeneretor.setBounds(100, 100, 602, 407);
		frmLambariGeneretor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLambariGeneretor.setVisible(true);
		frmLambariGeneretor.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		frmLambariGeneretor.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\question.png"));
		btnNewButton.setBounds(545, 11, 31, 33);
		panel.add(btnNewButton);
		
		lblLogin = new JLabel("Login Sugerido");
		lblLogin.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLogin.setBounds(276, 264, 145, 27);
		panel.add(lblLogin);
		
		lblPassword = new JLabel("Senha Sugerida");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword.setBounds(440, 264, 122, 27);
		panel.add(lblPassword);
		
		textName = new JTextField();
		textName.setBackground(Color.GRAY);
		textName.setColumns(10);
		textName.setBounds(10, 38, 232, 27);
		panel.add(textName);
		
		textDate = new JTextField();
		textDate.setBackground(Color.GRAY);
		textDate.setColumns(10);
		textDate.setBounds(10, 136, 232, 27);
		panel.add(textDate);
		
		lblDate = new JLabel("Data de Nascimento");
		lblDate.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDate.setBounds(10, 120, 246, 14);
		panel.add(lblDate);
		
		textSurname = new JTextField();
		textSurname.setBackground(Color.GRAY);
		textSurname.setColumns(10);
		textSurname.setBounds(10, 87, 232, 27);
		panel.add(textSurname);
		
		lblSurname = new JLabel("Sobrenome");
		lblSurname.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSurname.setBounds(10, 71, 246, 14);
		panel.add(lblSurname);
		
		lblName = new JLabel("Nome");
		lblName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblName.setBounds(10, 22, 246, 14);
		panel.add(lblName);
		
		JLabel lblInfo = new JLabel("Informação sobre o site ou setor:");
		lblInfo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblInfo.setBounds(10, 167, 246, 14);
		panel.add(lblInfo);
		
		JLabel lblInfo1 = new JLabel("Oque será Gerado?");
		lblInfo1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblInfo1.setBounds(10, 216, 145, 14);
		panel.add(lblInfo1);
		
		btnGeneretor = new JButton("GERAR");
		btnGeneretor.setFont(new Font("Dialog", Font.BOLD, 18));
		btnGeneretor.setForeground(Color.DARK_GRAY);
		btnGeneretor.setBackground(Color.LIGHT_GRAY);
		btnGeneretor.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\start.png"));
		btnGeneretor.setBounds(10, 287, 232, 70);
		panel.add(btnGeneretor);
		
		textAreaLogin = new JTextArea();
		textAreaLogin.setBackground(Color.GRAY);
		textAreaLogin.setBounds(276, 287, 138, 70);
		panel.add(textAreaLogin);
		
		textInfo = new JTextField();
		textInfo.setBackground(Color.GRAY);
		textInfo.setBounds(10, 183, 232, 27);
		panel.add(textInfo);
		textInfo.setColumns(10);
		
		textAreaPassword = new JTextArea();
		textAreaPassword.setBackground(Color.GRAY);
		textAreaPassword.setBounds(438, 287, 138, 70);
		panel.add(textAreaPassword);
		
		JComboBox comboBoxInfo = new JComboBox();
		comboBoxInfo.setModel(new DefaultComboBoxModel(new String[] {"Login", "Senha", "Login & Senha"}));
		comboBoxInfo.setSelectedIndex(2);
		comboBoxInfo.setFont(new Font("Dialog", Font.BOLD, 12));
		comboBoxInfo.setForeground(Color.BLACK);
		comboBoxInfo.setBackground(Color.LIGHT_GRAY);
		comboBoxInfo.setToolTipText("");
		comboBoxInfo.setBounds(10, 234, 170, 22);
		panel.add(comboBoxInfo);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 607, 389);
		lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\BackgroundScreen2.png"));
		panel.add(lblNewLabel);
	}
}
