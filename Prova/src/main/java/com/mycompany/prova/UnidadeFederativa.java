/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sao Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    protected final String nome;
    protected final String sigla;
    
    //construtor

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    //geteres

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    

}
