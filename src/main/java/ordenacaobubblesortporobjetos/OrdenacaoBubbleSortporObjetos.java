/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacaobubblesortporobjetos;

/**
 *
 * @author david.aosantos1
 */
public class OrdenacaoBubbleSortporObjetos {
    public static void main(String[] args) {
        Animal bidu = new Animal("Cachorro", "Bidu");
        Animal fred = new Animal("Peixe", "Fred");
        Animal rex = new Animal("Cachorro", "Rex");
        Animal akamaru = new Animal("Cachorro", "Akamaru");
        Animal mingau = new Animal("Gato", "Mingau");
        
        Animal[] animais = new Animal[]{bidu, fred, rex, akamaru, mingau};
    
        
        OrdenacaoBubbleSortporObjetos OBSO = new OrdenacaoBubbleSortporObjetos();
        OBSO.ordenarAnimaisPorNome(animais);
        for (int tamanho = 0; tamanho < animais.length; tamanho++) {
            System.out.println("Especie: " + animais[tamanho].getEspecie()
                    + " - Nome: " + animais[tamanho].getNome());
        }
        
    /**
     *
     * @param animais
     */
    public void ordenarAnimaisPorNome(Animal[] animais) {
            /* for utilizado para controlar a quantidade de vezes que o vetor será
ordenado. */
            for (int i = 0; i < animais.length - 1; i++) {
// Variavel utilizada para controlar se o vetor ja está ordenado.
                boolean estaOrdenado = true;
// for utilizado para ordenar o vetor.
                for (int j = 0; j < animais.length - 1 - i; j++) {
                    /* Se o nome do animal na posição atual do vetor for maior que o nome
do proximo animal, então troca os Animais de lugar no vetor. */
                    if (animais[j].getNome().compareToIgnoreCase(animais[j + 1].getNome()) > 0) {
                        Animal aux = animais[j];
                        animais[j] = animais[j + 1];
                        animais[j + 1] = aux;
                        estaOrdenado = false;
                    }
                }
                if (estaOrdenado) {
                    break;
                }

        }
    } //final metodo ordenar por nome
  }// final classe
};