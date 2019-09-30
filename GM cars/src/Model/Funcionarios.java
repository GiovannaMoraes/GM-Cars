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
public class Funcionarios {
    
    private int id_funcionario, numero;
    private String nome, cargo, cpf, rg, rua, bairro, cidade, estado, cep, formacao, ddd, numerotelefone, tiposangue, emergencianome, emergenciarelacao, emergenciaddd, emergenciatelefone;
    private Date datanascimento;
    
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
    
    public void setDatanascimento(Date _datanasc) {
            this.datanascimento = _datanasc;   
    }
    
    public Date getDatanascimento() {
        return this.datanascimento;
    }
    
    public void setFormacao(String _f) {
            this.formacao = _f;   
    }
    
    public String getFormacao() {
        return this.formacao;
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
    
    public void setTiposangue(String _tiposangue) {
            this.tiposangue = _tiposangue;   
    }
    
    public String getTiposangue() {
        return this.tiposangue;
    }
    
    public void setEmergenciaNome(String _emergencia_n) {
            this.emergencianome = _emergencia_n;   
    }
    
    public String getEmergenciaNome() {
        return this.emergencianome;
    }
    
    public void setEmergenciaRelacao(String _emergencia_r) {
            this.emergenciarelacao = _emergencia_r;   
    }
    
    public String getEmergenciaRelacao() {
        return this.emergenciarelacao;
    }
    
    public void setEmergenciaDdd(String _emergencia_ddd) {
            this.emergenciaddd = _emergencia_ddd;   
    }
    
    public String getEmergenciaDdd() {
        return this.emergenciaddd;
    }
    
    public void setEmergenciaTelefone(String _emergencia_tel) {
            this.emergenciatelefone = _emergencia_tel;   
    }
    
    public String getEmergenciaTelefone() {
        return this.emergenciatelefone;
    }
}
