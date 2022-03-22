/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacaobubblesortporobjetos;

/**
 *
 * @author david.aosantos1
 */
public class OrdenaçãoPorTrocas {

    public static void main(String[] args) {

        int i;
        char vet[] = {'v', 'f', 's', 'z', 'a'};

        bsort(vet, 5);
        
        System.out.println("Programa: OrdenaçãoPorTrocas.class\n");
        for (i = 0; i < 5; i++) {
            System.out.println("vet[" + i + "] = " + vet[i]);
        }
        
        
    static void bsort (char v[], int qtd){
        int i, j;
        char k;
        for (i = 1; i < qtd; i++) {
            for (j = 0; j < qtd - i; j++) {
                if (v[j] > v[j + 1]) {
                    k = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = k;
                }
            }
        }
    }
      
 }


