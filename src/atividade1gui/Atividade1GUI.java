package atividade1gui;

import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Atividade1GUI {
    public static void main(String[] args) {
        
        JFrame janela = new JFrame();
        janela.setSize(300, 200);
        janela.setVisible(true);
        janela.setTitle("MVP");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        
        JLabel rotulo = new JLabel();
        rotulo.setText("Digite o valor: ");
        janela.add(rotulo);
        
        JTextField campo = new JTextField(8);
        janela.add(campo);
        
        
        JButton botao = new JButton();
        botao.setText("Clique aqui");
        janela.add(botao);
        botao.addActionListener(new ButtonAction(campo));
        
    }
}
