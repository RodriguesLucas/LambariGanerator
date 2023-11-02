package br.com.unisc.project.frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class FirstInterface {

	private JFrame frmLambariGeneretor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstInterface window = new FirstInterface();
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
	public FirstInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLambariGeneretor = new JFrame();
		frmLambariGeneretor.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\icon_app.png"));
		frmLambariGeneretor.setTitle("Lambari Generetor");
		frmLambariGeneretor.setBounds(100, 100, 566, 407);
		frmLambariGeneretor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frmLambariGeneretor.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAux = new JButton("");
		btnAux.setBackground(Color.GRAY);
		btnAux.setForeground(Color.GRAY);
		btnAux.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAux.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\question.png"));
		btnAux.setBounds(506, 11, 32, 33);
		panel.add(btnAux);
		
		JButton btnStart = new JButton("Iniciar");
		btnStart.setFont(new Font("Dialog", Font.BOLD, 18));
		btnStart.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\start.png"));
		btnStart.setBounds(205, 324, 123, 33);
		panel.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(2, 5, 545, 401);
		lblBackground.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\BackgroundStart.png"));
		panel.add(lblBackground);
		frmLambariGeneretor.setVisible(true);
	}

}
