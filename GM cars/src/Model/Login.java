/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Login {
    
    private int id_login, id_funcionario;
    private String usuario, senha;
    
    public void setId_login (int _id_login) {
        this.id_login = _id_login;
    }
    
    public int getId_login () {
        return id_login;
    }
    
    public void setId_funcionario (int _id_funcionario) {
        this.id_funcionario = _id_funcionario;
    }
    
    public int getId_funcionario () {
        return id_funcionario;
    }
    
    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setSenha (String senha) {
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }
    
}
