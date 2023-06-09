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
public class Advogado extends Funcionario{
    private String aob;
    
    //construtor

    public Advogado(String aob, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, dataNascimento, nome, telefone, email, endereco);
        this.aob = aob;
    }
    
    //geteres e seteres

    public String getAob() {
        return aob;
    }

    public void setAob(String aob) {
        this.aob = aob;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
                "\n AOB: " + aob;
    }
    
    
    
}
