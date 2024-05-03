

//Dado o array = [9, 5, 1, 3, 4, 7, 2], ordene os números em ordem crescente com o Insertion-Sort  e descreva quantas comparações e trocas foram realizadas.

public class myInsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 3, 4, 7, 2};
        int[] result = insertionSort(array);
        
        // Imprimir array ordenado
        System.out.print("Array ordenado: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Contagem de comparações e trocas
        int[] counts = countComparisonsAndSwaps(array);
        System.out.println("Número de comparações: " + counts[0]);
        System.out.println("Número de trocas: " + counts[1]);
    }

    public static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static int[] countComparisonsAndSwaps(int[] array) {
        int comparisons = 0;
        int swaps = 0;

        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                comparisons++;
                array[j + 1] = array[j];
                j = j - 1;
                swaps++;
            }
            comparisons++;
            array[j + 1] = key;
            swaps++;
        }
        int[] counts = {comparisons, swaps};
        return counts;
    }
}

/*Aqui está uma explicação do código:

Classe InsertionSort: É a classe principal que contém o método main onde o programa é iniciado.
Método main: Este método é o ponto de entrada do programa. Aqui estão os seguintes passos:
Declaração e inicialização do array array com os números a serem ordenados.
Chamada do método insertionSort(array) para ordenar o array e armazenar o resultado em result.
Impressão do array ordenado.
Chamada do método countComparisonsAndSwaps(array) para contar o número de comparações e trocas realizadas durante a ordenação.
Impressão do número de comparações e trocas.
Método insertionSort: Este método implementa o algoritmo de ordenação Insertion Sort. Aqui estão os passos principais:
Iteração sobre o array a partir do segundo elemento.
Para cada elemento, ele é comparado com os elementos à sua esquerda na parte já ordenada do array.
O elemento é inserido na posição correta no array ordenado.
Método countComparisonsAndSwaps: Este método conta o número de comparações e trocas realizadas durante a ordenação. Ele funciona de maneira semelhante ao método insertionSort, mas registra as contagens de comparações e trocas em vez de realizar a ordenação em si.
No final, o programa imprime o array ordenado e o número de comparações e trocas realizadas durante o processo de ordenação.

O algoritmo de Insertion Sort é eficiente para arrays pequenos ou quase ordenados, mas tem uma complexidade de tempo de O(n^2) no pior caso e no caso médio.
*/