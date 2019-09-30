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
public class Entrada {
    
    private int id_entrada, id_orcamento;
    private Date data;
    private Float valor;
    private String horario;
    
    public void setId_entrada(int _i) throws Exception {
        
        if (_i > 0) {
            this.id_entrada= _i;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_entrada() {
        return this.id_entrada;
    }
    
    public void setId_orcamento(int _io) throws Exception {
        
        if (_io > 0) {
            this.id_orcamento= _io;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_orcamento() {
        return this.id_orcamento;
    }
    
    public void setData(Date _d) {
            this.data = _d;   
    }
    
    public Date getData() {
        return this.data;
    }
    
    public void setHorario(String _h) {
            this.horario = _h;   
    }
    
    public String getHorario() {
        return this.horario;
    }
    
    public void setValor(Float _v) {
            this.valor = _v;   
    }
    
    public Float getValor() {
        return this.valor;
    }
    
}
