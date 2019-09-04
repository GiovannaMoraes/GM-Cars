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
public class Carros {
    
    private int id_carro, ano;
    private String categoria, marca, modelo, cor, placa, combustivel, chassi;
    
     public void setId_carro(int _i) throws Exception {
        
        if (_i > 0) {
            this.id_carro= _i;
        } else {
            throw new Exception ("ID não pode ser menos que zero");
        }   
    }
    
    public int getId_carro() {
        return this.id_carro;
    }
    
    public void setCategoria(String _c) {
            this.categoria = _c;   
    }
    
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setMarca(String _m) {
            this.marca = _m;   
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setModelo(String _mo) {
            this.modelo = _mo;   
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
     public void setAno(int _ano) throws Exception {
            this.ano= _ano;  
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setCor(String _cor) {
            this.cor = _cor;   
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setPlaca(String _p) {
            this.placa = _p;   
    }
    
    public String getPlaca() {
        return this.placa;
    }
    public void setCombustivel(String _co) {
            this.combustivel = _co;   
    }
    
    public String getCombustivel() {
        return this.combustivel;
    }
    
    public void setChassi(String _chassi) {
            this.chassi = _chassi;   
    }
    
    public String getChassi() {
        return this.chassi;
    }
    
}
