/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA("Enegenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    OPERACOES("Operacoes");
    
    protected final String nome;
    
    //cosntrutor

    private Setor(String nome) {
        this.nome = nome;
    }
    
    //geteres

    public String getNome() {
        return nome;
    }
    
    
}
