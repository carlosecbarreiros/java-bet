/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenuUsuario;

import CacaNiquel.TelaCN;
import Cadastro_e_Login.UsuarioHistoricoCL;
import Cadastro_e_Login.UsuarioCL;
import Cadastro_e_Login.UsuarioBancoCL;
import BlackJack.TelaBJ;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MetodosHistoricoMU {
    
    
    public void inserirHistBlackJack(TelaBJ classe, UsuarioBancoCL hist, TelaHistoricoMU telaH) {
        int ID = classe.getID();
        int IDAposta = hist.bancoDados[ID - 1].getContadorHist();
        
        hist.historico[ID - 1][IDAposta] = new UsuarioHistoricoCL();
        hist.historico[ID - 1][IDAposta].setID_aposta(IDAposta + 1);
        hist.historico[ID - 1][IDAposta].setJogo("Black Jack");
        hist.historico[ID - 1][IDAposta].setLP(classe.getApostas() - classe.getSaldoInicial());
        
        telaH.setTableModel((DefaultTableModel) telaH.tabelaHistorico.getModel());
        
        Object[] rowData = {hist.historico[ID - 1][IDAposta].getID_aposta(), hist.historico[ID - 1][IDAposta].getJogo(),hist.historico[ID - 1][IDAposta].getLP()};
        
        telaH.tableModel.addRow(rowData);
        
        hist.bancoDados[ID - 1].addContadorHist();
        
        telaH.apagarHist.setEnabled(true);
    }
    
    public void inserirHistSorteio(TelaCN classe, UsuarioBancoCL hist, TelaHistoricoMU telaH) {
        int ID = classe.getID();

        int IDAposta = hist.bancoDados[ID - 1].getContadorHist();
        
        hist.historico[ID - 1][IDAposta] = new UsuarioHistoricoCL();
        hist.historico[ID - 1][IDAposta].setID_aposta(IDAposta + 1);
        hist.historico[ID - 1][IDAposta].setJogo("Caça Níquel");
        hist.historico[ID - 1][IDAposta].setLP(classe.getValorsaldo()- classe.getValorsaldoInicial());
        
        telaH.setTableModel((DefaultTableModel) telaH.tabelaHistorico.getModel());
        
        Object[] rowData = {hist.historico[ID - 1][IDAposta].getID_aposta(), hist.historico[ID - 1][IDAposta].getJogo(),hist.historico[ID - 1][IDAposta].getLP()};
        telaH.tableModel.addRow(rowData);
        
        hist.bancoDados[ID - 1].addContadorHist();
        
        telaH.apagarHist.setEnabled(true);
    }
    
    
    
    public void procurarPorId(int id, UsuarioBancoCL banco, TelaHistoricoMU inte, int IDusuario) {
            try {
                if (banco.historico[IDusuario] != null) {
                Object[] rowData = {banco.historico[IDusuario - 1][id - 1].getID_aposta(), banco.historico[IDusuario - 1][id - 1].getJogo(),banco.historico[IDusuario - 1][id - 1].getLP()};
                
                inte.tableModel.setRowCount(0);
                inte.tableModel.addRow(rowData);
                }
            }
             catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Aposta não encontrada");
            }
        }
}
