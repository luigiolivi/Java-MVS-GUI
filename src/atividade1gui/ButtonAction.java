package atividade1gui;

  import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import javax.swing.JOptionPane;
  import javax.swing.JTextField;

public class ButtonAction implements ActionListener {
      private JTextField campo;

      public ButtonAction (JTextField campo) {
          this.campo = campo;
      }
      
     
      
      @Override
      public void actionPerformed(ActionEvent e) {
        if (Float.parseFloat(campo.getText()) >= 500) {
            float desconto;
            desconto = Float.parseFloat(JOptionPane.showInputDialog("Digite o desconto percentual (%): "));
            
            float valorFinal = Float.parseFloat(campo.getText()) * (1 - (desconto / 100));
            
            JOptionPane.showMessageDialog(null, "Valor de R$" + valorFinal + " adicionado com sucesso!");
        }
                  
        else JOptionPane.showMessageDialog(null, "Valor de R$" + campo.getText() + " adicionado com sucesso!");
        }
      

}
