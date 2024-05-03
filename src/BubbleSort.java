
//Dado o array = [9, 5, 1, 3, 4, 7, 2], ordene os números em ordem crescente com o Bubble-Sort e,
//depois, descreva quantas comparações e trocas foram realizadas.

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 3, 4, 7, 2};
        
        // Chama o método para ordenar o array
        bubbleSort(array);
        
        // Imprime o array ordenado
        // int num : array, significa que num é uma variável temporária do tipo int que receberá cada elemento do array array durante a iteração.
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length; //o comando .length é utilizado para determinar o tamanho de arrays
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Se nenhum elemento foi trocado nesta iteração, então o array está ordenado
            if (!swapped) {
                break;
            }
        }
    }
}
