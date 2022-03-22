/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadados;

/**
 *
 * @author david.aosantos1
 */

import java.util.Scanner;

public class BSortCrescente {
    static int numero[] = new int[5];
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i, aux, troca;
        System.out.println("\nEXEMPLO BUBBLE SORT CRESCENTE");
        System.out.println("\n--------------------------------------------");
        System.out.println("\nInicializando o Array");
        for(i=0; i<5; i++){
            numero[i] = 0;
        }
        
        imprimir();
        System.out.println("\n--------------------------------------------");
        System.out.println("\nInserindo valores no Array\n");
        for(i=0; i<5; i++)
        {
        System.out.println("|Posição " + i + "|Digite um número: ");
        numero[i] = leitor.nextInt();
        }
        System.out.println("\n--------------------------------------------");
        System.out.println("\nValores armazenados no array");
        imprimir();
        System.out.println("\n--------------------------------------------");
        System.out.println("\nOrdenando o Array");
        troca = 1;
                
        while (troca == 1)
        {
        troca = 0; 
        for (i = 0; i <= 3; i++)
        {
        if (numero[i] > numero[i + 1])
        {
        troca = 1;
        aux = numero[i];
        numero[i] = numero[i + 1];
        numero[i + 1] = aux;
        }
        }
        }
        
        System.out.println("\n--------------------------------------------");
        System.out.println("\nValores ordenados");
        imprimir();
        System.out.println("\n--------------------------------------------");
        }
        static void imprimir()
        {
        System.out.println("\n--------------------------------------------");
        for (int i=0; i<5; i++)
        {
        System.out.println("|Posicao: " + i + " | Número: " + numero[i]);
        }
        }
};

        

