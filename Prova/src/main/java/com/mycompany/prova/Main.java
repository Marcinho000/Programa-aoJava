/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Juridica");
        Juridica juridica = new Juridica("487.484.158/4545/78", "45875", "LTDA TEL", "7198565452", "tel@gmail.com",
        new Endereco("teste", "48", "rua a","4875465456", "Salvador", UnidadeFederativa.BAHIA));
        System.out.println(juridica);
        
        
        System.out.println("");
        
        
        System.out.println("Cliente");
        Cliente cliente = new Cliente(Genero.FEMININO, LocalDate.of(1998, Month.APRIL, 4), "Carla", "7184848456", "carla@gmail.com", 
        new Endereco("testes", "49", "rua b","48978456", "Sao Paulo", UnidadeFederativa.SAO_PAULO));
        System.out.println(cliente);
        
        
        System.out.println("");
        
        System.out.println("Motoboy");
        Motoboy motoboy = new Motoboy("4856454845", "48796548421", "48745641545", "48754", Setor.OPERACOES, 1000, Genero.MASCULINO, LocalDate.of(1997, Month.MARCH, 1), "Joao", "7198545632", "joao@gmail.com", 
        new Endereco("teste", "46", "rua c", "456456445", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO) );
        System.out.println(motoboy);
        
        System.out.println("");
        
        System.out.println("Advogado");
        Advogado advogado = new Advogado("48785", "4564548", "7879789789", "456456", Setor.JURIDICO, 80000, Genero.FEMININO, LocalDate.of(1989, Month.MARCH, 2), "maria", "719846546548", "maria@gmail.com", 
        new Endereco("teste", "41", "rua d", "4546456456", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        System.out.println(advogado);
        
        
        System.out.println("");
        
        System.out.println("Medico");
        Medico medico = new Medico("4897896", "45641532156","4564564", "64546", Setor.SAUDE, 900000, Genero.FEMININO, LocalDate.of(1995, Month.JUNE, 7), "joana", "71998456451", "joana@gmail.com", 
        new Endereco("teste", "15", "rua e", "45645789456", "salvador", UnidadeFederativa.BAHIA));
        System.out.println(medico);
       
    }
}
