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
public  abstract class Funcionario extends Fisica{ 
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;
    
    
    //construtor

    public Funcionario(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, dataNascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {    
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    //geteres e seteres
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //toString

    @Override
    public String toString() {
        return super.toString()+
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n  Matricula: " + matricula + 
                "\n  Setor: " + setor + 
                "\n Salario: " + salario;
    }
   
    

    
    
    
    
    
}

    
