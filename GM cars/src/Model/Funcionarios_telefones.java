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
public class Funcionarios_telefones {
    
    private int id_telefone, id_funcionario;
    private String ddd, numero;
    
    public void setId_telefone(int _it) throws Exception {
        
        if (_it > 0) {
            this.id_telefone= _it;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_telefone() {
        return this.id_telefone;
    }
    
    public void setId_funcionario(int _if) throws Exception {
        
        if (_if > 0) {
            this.id_funcionario= _if;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_funcionario() {
        return this.id_funcionario;
    }
    
    public void setDdd(String _ddd) throws Exception {
         this.ddd= _ddd;  
    }
    
    public String getDdd() {
        return this.ddd;
    }
    
    public void setNumero(String _numero) throws Exception {
         this.numero= _numero;  
    }
    
    public String getNumero() {
        return this.numero;
    }
}
