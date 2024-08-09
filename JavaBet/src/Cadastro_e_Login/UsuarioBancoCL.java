package Cadastro_e_Login;

import javax.swing.JOptionPane;

public class UsuarioBancoCL {

    int numUsuarios = 0;
    public UsuarioCL[] bancoDados = new UsuarioCL[2];
    public UsuarioHistoricoCL historico[][] = new UsuarioHistoricoCL[100][10000];

    public boolean cadastrar(TelaUsuarioCadastroCL inteface) {
        if (encontrarID(inteface.txtNomeDeUsuario.getText(), this.bancoDados) == -1) {
            if (inteface.txtSenha.getText().equals(inteface.txtSenha1.getText())) {
                if (numUsuarios +1 == bancoDados.length){
                    RedimencionarVetor();
                }
                this.bancoDados[numUsuarios] = new UsuarioCL(
                numUsuarios + 1,
                inteface.txtNome.getText(),
                inteface.txtSenha.getText(),
                inteface.txtCPF.getText(),
                inteface.txtTelefone.getText(),
                inteface.txtNomeDeUsuario.getText(),
                inteface.txtEmail.getText(),
                50,
                0);
                numUsuarios++;
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Confirmação de senha inválida");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este nome de usuário já está em uso");
            return false;
        }
    }
    public void RedimencionarVetor(){
        UsuarioCL[] temp = new UsuarioCL[bancoDados.length+1];
        for (int i=0; i<bancoDados.length;i++){
            temp[i]=bancoDados[i];
        }
        bancoDados=temp.clone();
    }
   
    public Boolean moderadorCadastrar(TelaModeradorCadastroCL inteface) {
        if (encontrarID(inteface.txtNomeDeUsuario.getText(), this.bancoDados) == -1) {
            if (numUsuarios +1 == bancoDados.length){
                    RedimencionarVetor();
                }
                this.bancoDados[numUsuarios] = new UsuarioCL(
                numUsuarios + 1,
                inteface.txtNome.getText(),
                inteface.txtSenha.getText(),
                inteface.txtCPF.getText(),
                inteface.txtTelefone.getText(),
                inteface.txtNomeDeUsuario.getText(),
                inteface.txtEmail.getText(),
                50,
                0);
                numUsuarios++;
                return true;
        } else {
            JOptionPane.showMessageDialog(null, "Este nome de usuário já está em uso");
            return false;
        }
    }
    
    public boolean moderadorAlterar(TelaModeradorAlterarCL inteface) {
        if (encontrarID(inteface.txtNomeDeUsuario.getText(), this.bancoDados) == -1 || bancoDados[inteface.ID - 1].getNomeDeUsuario().equals(inteface.txtNomeDeUsuario.getText())) {
                this.bancoDados[inteface.ID - 1].setNome(inteface.txtNome.getText());
                this.bancoDados[inteface.ID - 1].setSenha(inteface.txtSenha.getText());
                this.bancoDados[inteface.ID - 1].setCpf(inteface.txtCPF.getText());
                this.bancoDados[inteface.ID - 1].setTelefone(inteface.txtTelefone.getText());
                this.bancoDados[inteface.ID - 1].setNomeDeUsuario(inteface.txtNomeDeUsuario.getText());
                this.bancoDados[inteface.ID - 1].setEmail(inteface.txtEmail.getText());
                return true;
        } else {
                JOptionPane.showMessageDialog(null, "Este nome de usuário já está em uso");
                return false;
        }
    }
    

    public boolean verificarCadastro(TelaUsuarioCadastroCL inteface) {
        if (inteface.txtNome.getText() == null || inteface.txtSenha.getText() == null || inteface.txtCPF.getText() == null || inteface.txtTelefone.getText() == null || inteface.txtNomeDeUsuario.getText() == null || inteface.txtEmail.getText() == null) {
            return false;
        } else {
            return true;
        }
    }

    public int encontrarID(String nome, UsuarioCL banco[]) {
        for (UsuarioCL banco1 : banco) {
            if (banco1 != null && (banco1.getNomeDeUsuario().equals(nome))) {
                return banco1.getID();
            }
        }
        return -1;
    }
}
