/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO("Masculino",'M'),
    FEMININO("Feminino", 'F');
    
    protected final String texto;
    protected final char caracter;
    
    //construtor

    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }
    
    
    //geteres 

    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }
    

    
    
    
    
    
}
