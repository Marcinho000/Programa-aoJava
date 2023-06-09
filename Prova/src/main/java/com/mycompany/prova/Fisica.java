/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public class Fisica extends Pessoa{
   private Genero genero; 
    private LocalDate dataNascimento;

  //construtor
 public Fisica(Genero genero, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }
   

    //geteres e seteres

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        
      
    }
      public int getIdade(){
      return Period.between(dataNascimento,LocalDate.now()).getYears();
      
    }

   //toString

    @Override
    public String toString() {
        return super.toString() + 
                "\n Genero: " + genero + 
                "\n  Data Nascimento: " + dataNascimento;
    }


   
    
    
               
    
        
    }

   
  
    

   

