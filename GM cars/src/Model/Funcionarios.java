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
public class Funcionarios {
    
    private int id_funcionario, numero;
    private String nome, cargo, cpf, rg, rua, bairro, cidade, estado, cep ;
    
    public void setId_funcionario(int _i) throws Exception {
        
        if (_i > 0) {
            this.id_funcionario= _i;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_funcionario() {
        return this.id_funcionario;
    }
    
    public void setNome(String _n) {
            this.nome = _n;   
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCargo(String _c) {
            this.cargo = _c;   
    }
    
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCpf(String _cpf) {
            this.cpf = _cpf;   
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setRg(String _rg) {
            this.rg = _rg;   
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public void setRua(String _rua) {
            this.rua = _rua;   
    }
    
    public String getRua() {
        return this.rua;
    }
    
    public void setNumero(int _num) {
        this.numero = _num;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setBairro(String _bairro) {
            this.bairro = _bairro;   
    }
    
    public String getBairro() {
        return this.bairro;
    }
    
    public void setCidade(String _cidade) {
            this.cidade = _cidade;   
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public void setEstado(String _estado) {
            this.estado = _estado;   
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public void setCep(String _cep) {
            this.cep = _cep;   
    }
    
    public String getCep() {
        return this.cep;
    }
    
}