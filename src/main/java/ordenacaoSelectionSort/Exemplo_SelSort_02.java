/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacaoSelectionSort;

import java.util.Arrays;

/**
 *
 * @author david.aosantos1
 */
public class Exemplo_SelSort_02 {
    public static void main(String[] args) {
        int quantidade = 500;
        int[] vetor = new int[quantidade];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }
        long tempoInicial
                = System.currentTimeMillis();
        selectionSort(vetor);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em = "
                + (tempoFinal - tempoInicial) + " ms");
    }

    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1;
                fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
