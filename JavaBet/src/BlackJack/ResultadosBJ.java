/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackJack;

import javax.swing.JOptionPane;

public class ResultadosBJ {
    ComandoVinteumBJ a = new ComandoVinteumBJ();
    
    public void mostrarResultado(int ptosUsuario, int ptosOp, TelaBJ classe) {
        
        if(ptosUsuario == 21 && ptosOp == 21) {
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "Deu empate!!\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario);
        }
        
        else if (ptosUsuario == 21 && ptosOp != 21) {
            classe.apostas *= 2; 
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "VOCE GANHOU!!!!\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario + "\nSeu premio e de: RS " + classe.saldo);
        }
        
        else if (ptosUsuario != 21 && ptosOp == 21) {
            classe.apostas = 0; 
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "Não foi dessa vez...\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario);
        }
        
        else if(ptosUsuario < 21 && ptosUsuario > ptosOp) {
            classe.apostas *= 2;
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "VOCE GANHOU!!!!\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario + "\nSeu premio e de; RS " + classe.apostas);
        }
        
        else if(ptosOp < 21 && ptosUsuario < ptosOp) {
            classe.apostas = 0;
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "Que pena, na próxima você consegue!\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario);
        }
        
        else if (ptosOp == ptosUsuario) {
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "Nao houve ganhador\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario);
        }
        
        else if(ptosUsuario > 21) {
            classe.apostas = 0;
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "Não foi dessa vez...\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario);
        }
        
        else if (ptosOp > 21 && ptosUsuario <21) {
            classe.apostas *= 2; 
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "VOCE GANHOU!!!!\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario + "\nSeu premio e de: RS " + classe.apostas);                }
        
        else {
            classe.apostaUsu.setText(String.valueOf(classe.apostas));
            JOptionPane.showMessageDialog(null, "Não houve ganhador\nOponente: " + ptosOp + "\nVoce: " + ptosUsuario);
        }
        
        
    }
}
