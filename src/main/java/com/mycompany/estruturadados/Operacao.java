/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.estruturadados;
import java.util.Scanner;


/**
 *
 * @author david.aosantos1
 */
public class Operacao {
    static Scanner leitor = new Scanner(System.in);
    
    
    public static void main(String[] args){
        Aluno David = new Aluno();
        David.nmat = 456;
        David.nota[0] = 7.0;
        David.nota[1] = 5.5;
        David.nota[2] = 8.0;
        David.media = (David.nota[0] + David.nota[1] + David.nota[2]/3);
        System.out.println("Matricula: " + David.media);
        System.out.println("Media: " + David.media);
    }
    
    static class Aluno{
        int nmat; /* Numero da matricula */
        double nota[] = new double[3];/*Notas*/
        double media;  /*Média*/
        
    }; 
}
