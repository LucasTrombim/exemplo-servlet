/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.markson.objeto;

/**
 *
 * @author markson
 */
public class Cliente {
    private String nome,rg,cpf;

    public Cliente(String nome, String rg, String cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + '}';
    }
    
    
            
            
    
}
