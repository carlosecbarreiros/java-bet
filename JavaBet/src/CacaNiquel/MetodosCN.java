/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CacaNiquel;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class MetodosCN {
    int resultados[] = new int[3];
    Timer timer = new Timer();
    Random a = new Random();
    TelaCN tela = new TelaCN();
    
    
    public void rodarRoleta(TelaCN classe) {
        double premio = Double.parseDouble(classe.premio.getText());
        
         if (classe.Valorsaldo >= 20) {
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = a.nextInt(0,10);
        }
        
        classe.Resultado_1.setText(String.valueOf(resultados[0]));
            if (resultados[0] == 0) classe.resu1menos.setText("9");
            else classe.resu1menos.setText(String.valueOf(resultados[0] - 1));
            
            if (resultados[0] == 9) classe.resu1mais.setText("0");
            else classe.resu1mais.setText(String.valueOf(resultados[0] + 1));
            
        classe.Resultado_2.setText(String.valueOf(resultados[1]));
            if (resultados[1] == 0) classe.resu2menos.setText("9");
            else classe.resu2menos.setText(String.valueOf(resultados[1] - 1));
            
            if (resultados[1] == 9) classe.resu2mais.setText("0");
            else classe.resu2mais.setText(String.valueOf(resultados[1] + 1));
            
        classe.Resultado_3.setText(String.valueOf(resultados[2]));
            if (resultados[2] == 0) classe.resu3menos.setText("9");
            else classe.resu3menos.setText(String.valueOf(resultados[2] - 1));
            
            if (resultados[2] == 9) classe.resu3mais.setText("0");
            else classe.resu3mais.setText(String.valueOf(resultados[2] + 1));
            
        
        if (resultados[0] == resultados[1] && resultados[0] == resultados[2] && resultados[1] == resultados[2]) {
            classe.display.setText("Parabens!!!!"); 
            classe.banco.bancoDados[classe.getID() - 1].addSaldo(premio);
            classe.inin.lbl_saldo.setText( String.valueOf(classe.banco.bancoDados[classe.getID() - 1].getSaldo()));
            JOptionPane.showMessageDialog(null, "PARABÉNS!!\nVocê ganhou R$ " + premio + ",00!!!");
            premio = 0;
            classe.premio.setText(String.valueOf(premio));
        }
        else {
            classe.display.setText("Uhh, foi por pouco...");
            classe.Valorsaldo = classe.Valorsaldo - 20;
            premio += 20; classe.premio.setText(String.valueOf(premio));
            classe.saldo.setText(String.valueOf(classe.Valorsaldo));
            }
        }
        else classe. display.setText("Saldo insulficente, faca uma recarga para continuar jogando"); 
    }
    
    
    public Boolean depositar(TelaCN inter, TelaDepositoCN Deposito) {
        try {
            int dinheiro = Integer.parseInt(Deposito.deposito.getText());
        
        if (dinheiro <= 0) {JOptionPane.showMessageDialog(null, "Insira um valor válido"); return false;}
        else {
            Deposito.saldo += dinheiro;
            inter.saldo.setText(String.valueOf(Deposito.saldo));
            Deposito.setVisible(false);
            inter.setVisible(true);
            return true;
        }
        }
        catch (Exception e) {JOptionPane.showMessageDialog(null, "Erro ao depositar...");}
        return false;
        }
    }
    



