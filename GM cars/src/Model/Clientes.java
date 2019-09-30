/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Clientes {
    
    private int id_cliente, numero;
    private String nome, cpf, rg, cnh, rua, bairro, cidade, estado, cep, ddd, numerotelefone;
    private Date datanascimento;
    
    public void setId_cliente(int _i) throws Exception {
        
        if (_i > 0) {
            this.id_cliente= _i;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_cliente() {
        return this.id_cliente;
    }
    
    public void setNome(String _n) {
            this.nome = _n;   
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setDatanascimento(Date _datanasc) {
            this.datanascimento = _datanasc;   
    }
    
    public Date getDatanascimento() {
        return this.datanascimento;
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
    
    public void setCnh(String _cnh) {
            this.cnh = _cnh;   
    }
    
    public String getCnh() {
        return this.cnh;
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
    
    public void setDdd(String _ddd) {
            this.ddd = _ddd;   
    }
    
    public String getDdd() {
        return this.ddd;
    }
    
    public void setNumerotelefone(String _numtel) {
            this.numerotelefone = _numtel;   
    }
    
    public String getNumerotelefone() {
        return this.numerotelefone;
    }
}
