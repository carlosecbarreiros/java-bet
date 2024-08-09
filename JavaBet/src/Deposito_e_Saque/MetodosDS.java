/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deposito_e_Saque;

import javax.swing.JOptionPane;

public class MetodosDS {
    
    public void depositarOuSacar(TelaDS classe) {
        try {
            String senha = classe.txt_senhaSD.getText();

            if (classe.tbtnDeposito.isSelected() && senha.equals(classe.telaLoby.getSenha())) {
                
                Double valorDEP = Double.valueOf(classe.txt_valorSD.getText());
                Double conta = classe.banco.bancoDados[classe.ID - 1].getSaldo();
                
                classe.banco.bancoDados[classe.ID - 1].setSaldo(conta + valorDEP);
                
                classe.telaLoby.setVisible(true);
                classe.telaLoby.lbl_saldo.setText(String.valueOf(valorDEP + conta));
                classe.dispose();
                
            } else if (classe.tbtnSaque.isSelected() && senha.equals(classe.telaLoby.getSenha())) {
                Double valorDEP = Double.valueOf(classe.txt_valorSD.getText());
                Double conta = classe.banco.bancoDados[classe.ID - 1].getSaldo();
                
                if (conta - valorDEP < 0) {JOptionPane.showMessageDialog(null, "Não é possível sacar um valor maior do que o existente na sua conta");}
                
                else {
                classe.banco.bancoDados[classe.ID - 1].setSaldo(conta - valorDEP);
                
                classe.telaLoby.setVisible(true);
                classe.telaLoby.lbl_saldo.setText(String.valueOf(conta - valorDEP));
                classe.dispose();
                }
            }  
                else if (!classe.tbtnSaque.isSelected() && !classe.tbtnDeposito.isSelected()) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione um tipo de transação");
            } 
                else {
                JOptionPane.showMessageDialog(null, "Senha ou valor inválidos");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um valor valido");
        }
    }
    
    
}
