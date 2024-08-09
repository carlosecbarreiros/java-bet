
package Cadastro_e_Login;

public class UsuarioCL {
        
    private int ID;
    private String nome;
    private String senha;
    private String cpf;
    private String Telefone;
    private String nomeDeUsuario;
    private String email;
    private double saldo;
    private int contadorHist = 0;
    double saldoCacaNiquel;

    public UsuarioCL() {
    }

    
    public UsuarioCL(int ID, String nome, String senha, String cpf, String Telefone, String nomeDeUsuario, 
            String email, double saldo, int contadorHist) {
        this.ID = ID;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.Telefone = Telefone;
        this.nomeDeUsuario = nomeDeUsuario;
        this.email = email;
        this.saldo = saldo;
        this.contadorHist = contadorHist;     
    }

    public void setSaldoCacaNiquel(double saldoCacaNiquel) {
        this.saldoCacaNiquel = saldoCacaNiquel;
    }

    public double getSaldoCacaNiquel() {
        return saldoCacaNiquel;
    }
    

    public void setContadorHist(int contadorHist) {
        this.contadorHist = contadorHist;
    }

    public int getContadorHist() {
        return contadorHist;
    }

    public void addContadorHist() {
        this.contadorHist += 1;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void addSaldo(double add) {
        this.saldo += add;
    }
    

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getNomedeusuario() {
        return nomeDeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setNomedeusuario(String nomedeusuario) {
        this.nomeDeUsuario = nomedeusuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
