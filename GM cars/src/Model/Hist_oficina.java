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
public class Hist_oficina {
    
    private int id_hist_oficina, id_carro;
    private String empresa, conserto;
    private Date data;
    private Float valor;
    
    public void setId_hist_oficina(int _i) throws Exception {
        
        if (_i > 0) {
            this.id_hist_oficina= _i;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_hist_oficina() {
        return this.id_hist_oficina;
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
    
    public void setEmpresa(String _e) {
            this.empresa = _e;   
    }
    
    public String getEmpresa() {
        return this.empresa;
    }
    
    public void setData(Date _d) {
            this.data = _d;   
    }
    
    public Date getData() {
        return this.data;
    }
    
    public void setConserto(String _c) {
            this.conserto = _c;   
    }
    
    public String getConserto() {
        return this.conserto;
    }
    
    public void setValor(Float _v) {
            this.valor = _v;   
    }
    
    public Float getValor() {
        return this.valor;
    }
    
}
