/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastro_e_Login;

import MenuUsuario.TelaInicialMU;
import javax.swing.JOptionPane;

public class UsuarioLoginCL {
    
    public boolean verificarLogin(UsuarioCL[] usuarios, String nome, String senha) {
        for (UsuarioCL usuario : usuarios) {
            if (usuario != null && usuario.getNomeDeUsuario().equals(nome) && usuario.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                return true;//login valido
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
        return false; // Login inválido
    }
    
    
    
    public void FazerLogin(TelaUsuarioLoginCL classe) {
    try {
            TelaInicialMU logado = new TelaInicialMU();
            
            String nome = classe.txtNome.getText();
            String senha = classe.txtSenha.getText();
            
            
            if (classe.tbtn_moderador.isSelected()) {
                ModeradorCL moderador = new ModeradorCL();

                moderador.setNomedeUsuario(nome);
                moderador.setSenha(senha);
                if (moderador.getNomedeUsuario().equals("Moderador")
                        && moderador.getSenha().equals("1234")) {
                    TelaModeradorMenuCL telaNova = new TelaModeradorMenuCL();
                    telaNova.setVisible(true);
                    telaNova.volta = classe;
                    telaNova.banco = classe.banco;
                    telaNova.MostrarUsuarios();
                    classe.setVisible(false);
                } else {JOptionPane.showMessageDialog(null, "Login de moderador inválido");}
            }else {
                
                if (verificarLogin(classe.banco.bancoDados, nome, senha)) {
                        logado.setVisible(true);
                        logado.lbl_usuarioLog.setText(classe.banco.bancoDados[classe.ID - 1].getNomeDeUsuario());
                        logado.setLogin(classe);
                        logado.setBanco(classe.banco);
                        logado.setID(classe.getID());
                        logado.setSenha(senha);
                        logado.lbl_saldo.setText(String.valueOf(classe.banco.bancoDados[classe.ID - 1].getSaldo()));
                        classe.setVisible(false);
                        logado.mostrarHistorico();
                    }
                }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuarios ou senha incorretos - " + e);
        }

    
    }
    
}
