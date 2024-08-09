/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackJack;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class ComandoVinteumBJ {
    Random e = new Random();
    int aleatorio;
    int pontosUsuario = 0;
    int pontosOponente = 0;
    
     
    public void prepararBaralho(String[] vetor, int[] vetor2) {
    int num = 1;
        for (int i = 0; i < vetor.length; i += 4) {
            for (int j = 0; j <= 3; j++) {
                switch (num) {
                    case 1: 
                        vetor[j + i] = String.valueOf("A");
                        vetor2[j + i] = 1;
                        break;
                    case 11:
                        vetor[j + i] = String.valueOf("Q");
                        vetor2[j + i] = 10;
                        break;
                    case 12:
                        vetor[j + i] = String.valueOf("J");
                        vetor2[j + i] = 10;
                        break;
                    case 13:
                        vetor[j + i] = String.valueOf("K");
                        vetor2[j + i] = 10;
                        break;
                    default:
                        vetor[j + i] = String.valueOf(num);
                        vetor2[j + i] = num;
                        break;
                }  
            } 
            num++;
        }
    }
    
    public void puxarCartas(String[] vetor, int[] vetor2, int contador, TelaBJ classe) {
        
        aleatorio = e.nextInt(0, 52);
        while (vetor[aleatorio] == null) {aleatorio = e.nextInt(0, 52);}
            
        switch (contador) {
            case 1:
                classe.p1.setVisible(true);
                classe.cart1.setText(vetor[aleatorio]); 
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 2:
                classe.p2.setVisible(true);
                classe.cart2.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 3:
                classe.p3.setVisible(true);
                classe.cart3.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 4:
                classe.p4.setVisible(true);
                classe.cart4.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 5:
                classe.p5.setVisible(true);
                classe.cart5.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 6:
                classe.p6.setVisible(true);
                classe.cart6.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 7:
                classe.p7.setVisible(true);
                classe.cart7.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 8:
                classe.p8.setVisible(true);
                classe.cart8.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 9:
                classe.p9.setVisible(true);
                classe.cart9.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 10:
                classe.p10.setVisible(true);
                classe.cart10.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            case 11:
                classe.p11.setVisible(true);
                classe.cart11.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                pontosUsuario += vetor2[aleatorio];
                break;
            }
                
            classe.pontuacao.setText(String.valueOf(pontosUsuario));
        
            if (pontosUsuario == 21) {
                classe.botaoParar.doClick();
            }
            else if (pontosUsuario > 21) {
                classe.botaoJogar.setEnabled(false);
                classe.resultado.setText("Estourou");
                classe.botaoParar.doClick();
            }
        }
    
    public int puxarCartasOp(String[] vetor, int[] vetor2, int contador, TelaBJ classe) {
                aleatorio = e.nextInt(0, 52);
                while (vetor[aleatorio] == null) {aleatorio = e.nextInt(0, 52);}
            
        switch (contador) {
            case 1:
                classe.p12.setVisible(true);
                classe.cart12.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 2:
                classe.p13.setVisible(true);
                classe.cart13.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 3:
                classe.p28.setVisible(true);
                classe.cart28.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 4:
                classe.p29.setVisible(true);
                classe.cart29.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 5:
                classe.p30.setVisible(true);
                classe.cart30.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 6:
                classe.p31.setVisible(true);
                classe.cart31.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 7:
                classe.p32.setVisible(true);
                classe.cart32.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 8:
                classe.p33.setVisible(true);
                classe.cart33.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 9:
                classe.p34.setVisible(true);
                classe.cart34.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 10:
                classe.p35.setVisible(true);
                classe.cart35.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            case 11:
                classe.p36.setVisible(true);
                classe.cart36.setText(vetor[aleatorio]);
                vetor[aleatorio] = null;
                this.pontosOponente = vetor2[aleatorio];
                break;
            }
        return this.pontosOponente;
        }
            

}
    
   


    
    
        


    

