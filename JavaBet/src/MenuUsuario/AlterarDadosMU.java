/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenuUsuario;

import Cadastro_e_Login.TelaUsuarioLoginCL;
import Cadastro_e_Login.UsuarioBancoCL;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinícius
 */
public class AlterarDadosMU {
    public void alterarDados(TelaAlterarMU classe, UsuarioBancoCL banco) {
        try {
        String resposta = JOptionPane.showInputDialog(null, "Digite sua senha para confirmar a alteração dos dados");
        if (banco.encontrarID(classe.txtNomeDeUsuario.getText(), banco.bancoDados) == -1 || banco.bancoDados[classe.ID - 1].getNomeDeUsuario().equals(classe.txtNomeDeUsuario.getText())) {
            if (resposta.equals(classe.banco.bancoDados[classe.ID - 1].getSenha())) {
                classe.banco.bancoDados[classe.ID - 1].setNome(classe.txtNome.getText());
                classe.banco.bancoDados[classe.ID - 1].setCpf(classe.txtCPF.getText());
                classe.banco.bancoDados[classe.ID - 1].setEmail(classe.txtEmail.getText());
                classe.banco.bancoDados[classe.ID - 1].setTelefone(classe.txtTelefone.getText());
                classe.banco.bancoDados[classe.ID - 1].setNomeDeUsuario(classe.txtNomeDeUsuario.getText());
                classe.banco.bancoDados[classe.ID - 1].setSenha(classe.txtSenha.getText());
            
                classe.login.setVisible(true);
                classe.login.btnLimpar.doClick();
                classe.telaperf.dispose();
                classe.dispose();
        }   else {
            JOptionPane.showMessageDialog(null, "Senha inserida incorreta\nLmbre-se: você deve inserir sua senha antiga");
        }
            } else {JOptionPane.showMessageDialog(null, "Este nome de usuário já está em uso");}
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "Campo de senha inválido");}
    
    }
    
    public void ExcluirUsuario(TelaAlterarMU classe) {
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir sua conta?\nTodos os seus dados serão deletados premanetemente");
        
        if (resposta == JOptionPane.YES_OPTION){
            classe.banco.bancoDados[classe.ID - 1] = null;
            
            System.out.println(Arrays.toString(classe.banco.bancoDados));
            
            
            classe.login.setVisible(true);
            classe.login.btnLimpar.doClick();
            classe.telaperf.dispose();
            classe.dispose();
        }  
    }
    
}
