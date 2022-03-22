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
public class CadastroProduto {

    public static final int QUANTIDADE_DE_PRODUTOS = 3;

    public static void main(String[] args) {
        int i;
        Produto[] produto = new Produto[QUANTIDADE_DE_PRODUTOS];
        Scanner leitor = new Scanner(System.in);
        for (i = 0; (i < QUANTIDADE_DE_PRODUTOS); i++) {
            System.out.println("Informe os dados do produto: " + (i + 1));
            produto[i] = new Produto();
            produto[i].cod = leitor.nextLong();
            produto[i].nome = leitor.next();
            produto[i].preco = leitor.nextFloat();
        }
        System.out.println("Informe o produto: ");
        float produto_localizador = leitor.nextFloat();
        System.out.println("\nProduto\tPreco");

        for (i = 0; (i < QUANTIDADE_DE_PRODUTOS); i++) { //2
            if (produto_localizador == produto[i].cod) { //3
                System.out.println(produto[i].nome + " " + produto[i].preco);
                break;
            }
        }
    }

    static class Produto /*Inicio da definição da estrutura */ {

        long cod;
        String nome;
        float preco;
    }
}
