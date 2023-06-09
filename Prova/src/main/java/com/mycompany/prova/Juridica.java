/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    
    //construtor

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    //geteres e seteres

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
                "\n CNPJ: " + cnpj + 
                "\n Inscrição Estadual: " + inscricaoEstadual;
    }
    
    
}
