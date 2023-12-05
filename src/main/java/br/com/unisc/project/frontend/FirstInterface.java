package br.com.unisc.project.frontend;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class FirstInterface {

    private JFrame frmLambariGeneretor;

    public FirstInterface() {
        initialize();
    }

    private void initialize() {
        frmLambariGeneretor = new JFrame();
        frmLambariGeneretor.setResizable(false);
        frmLambariGeneretor.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\icon_app.png"));
        frmLambariGeneretor.setTitle("Lambari Generetor");
        frmLambariGeneretor.setBounds(100, 100, 566, 407);
        frmLambariGeneretor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmLambariGeneretor.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frmLambariGeneretor.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JButton btnAux = new JButton("");
        btnAux.setBackground(Color.LIGHT_GRAY);
        btnAux.setForeground(Color.LIGHT_GRAY);
        btnAux.setFont(new Font("Dialog", Font.BOLD, 12));
        btnAux.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\question.png"));
        btnAux.setBounds(506, 11, 32, 33);
        panel.add(btnAux);

        // Texto de ajuda da tela inicial
        btnAux.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Grupo Nº 7: Henyo Nunes e Lucas Rodrigues.\n" +
                                "       Em um mundo cada vez mais interconectado e dependente da tecnologia, a segurança da informação\n" +
                                "desempenha um papel fundamental na proteção de dados. Protegendo os usuários dos perigos impostos\n" +
                                "no âmbito virtual, se torna indispensável a utilização de senhas seguras e complexas para a proteção\n" +
                                "de suas contas. O'Que acaba não acontecendo muitas vezes com usuários leigos e pequenas empresas,\n" +
                                "onde são criadas senhas sem complexidade e muitas vezes esquecidas pelos usuários.\n" +
                                "       Pensando nisso, desenvolvemos um gerador de senhas e logins voltado a facilitar para o usuário, mas\n" +
                                "sem perder a complexidade.\n",
                                "Ajuda", 1);
            }
        });

        JButton btnStart = new JButton("Iniciar");
        btnStart.setFont(new Font("Dialog", Font.BOLD, 18));
        btnStart.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\start.png"));
        btnStart.setBounds(205, 324, 123, 33);
        panel.add(btnStart);

        // Chamada para a segunda interface
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmLambariGeneretor.setVisible(false);
                new SecondInterface();
            }
        });

        JLabel lblBackground = new JLabel("");
        lblBackground.setBounds(2, 5, 545, 401);
        lblBackground.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\unisc\\project\\frontend\\assets\\BackgroundStart.png"));
        panel.add(lblBackground);
        frmLambariGeneretor.setVisible(true);
    }
}
