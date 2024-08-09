/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastro_e_Login;

/**
 *
 * @author Vinícius
 */
public class ModeradorCL extends UsuarioBancoCL {

    
    String nomedeusuario;
    String senha;

    public String getNomedeUsuario() {
        return nomedeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setNomedeUsuario(String nome) {
        this.nomedeusuario = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
