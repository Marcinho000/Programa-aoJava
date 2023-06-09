/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    private int protocoloAtendimento;
    
    //construtor

    public Cliente(Genero genero, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, dataNascimento, nome, telefone, email, endereco);
    }
    
    //geteres e seteres 

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    ///toString

    @Override
    public String toString() {
        return super.toString() +
                "\n Protocolo de Atendimento: " + protocoloAtendimento;
    }
    
    
}
