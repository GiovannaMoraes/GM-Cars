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
public class Saida {
    
    private int id_saida, id_funcionario;
    private String descricao, horario;
    private Date data;
    private Float valor;
    
    public void setId_saida(int _i) throws Exception {
        
        if (_i > 0) {
            this.id_saida= _i;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_saida() {
        return this.id_saida;
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
    
    public void setDescricao(String _desc) {
            this.descricao = _desc;   
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setData(Date _d) {
            this.data = _d;   
    }
    
    public Date getData() {
        return this.data;
    }
    
    public void setHorario(String _horario) {
            this.horario = _horario;   
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
