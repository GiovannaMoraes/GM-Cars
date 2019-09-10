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
public class Orcamentos {
    private int id_orcamento, id_cliente, id_carro, total_diarias;
    private String status;
    private Date data_inicio, data_termino;
    private Float valor_diaria, valor_total;
    
    public void setId_orcamento(int _i) throws Exception {
        
        if (_i > 0) {
            this.id_orcamento= _i;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_orcamento() {
        return this.id_orcamento;
    }
    
    public void setId_cliente(int _ic) throws Exception {
        
        if (_ic > 0) {
            this.id_cliente= _ic;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_cliente() {
        return this.id_cliente;
    }
    
    public void setId_carro(int _ic) throws Exception {
        
        if (_ic > 0) {
            this.id_carro= _ic;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_carro() {
        return this.id_carro;
    }
    
    public void setStatus(String _s) {
            this.status = _s;   
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setData_inicio(Date _di) {
            this.data_inicio = _di;   
    }
    
    public Date getData_inicio() {
        return this.data_inicio;
    }
    
    public void setData_termino(Date _dt) {
            this.data_termino = _dt;   
    }
    
    public Date getData_termino() {
        return this.data_termino;
    }
    
    public void setTotal_diarias(int _totald) throws Exception {

            this.total_diarias= _totald; 
    }
    
    public int getTotal_diarias() {
        return this.total_diarias;
    }
    
    public void setValor_diaria(Float _vd) {
            this.valor_diaria = _vd;   
    }
    
    public Float getValor_diaria() {
        return this.valor_diaria;
    }
    
    public void setValor_total(Float _vt) {
            this.valor_total = _vt;   
    }
    
    public Float getValor_total() {
        return this.valor_total;
    }
}
