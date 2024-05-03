public class myQuickSort {
    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            // Divide o array e obtém o índice do elemento pivot
            int indicePivot = partition(arr, inicio, fim);
            
            // Ordena recursivamente os subarrays à esquerda e à direita do pivot
            quickSort(arr, inicio, indicePivot - 1);
            quickSort(arr, indicePivot + 1, fim);
        }
    }
    
    // Função auxiliar para particionar o array
    public static int partition(int[] arr, int inicio, int fim) {
        // Escolhe o último elemento como pivot
        int pivot = arr[fim];
        int indicePivot = inicio;
        
        // Particiona o array ao redor do pivot
        for (int i = inicio; i < fim; i++) {
            if (arr[i] <= pivot) {
                // Troca arr[i] com arr[indicePivot]
                int temp = arr[i];
                arr[i] = arr[indicePivot];
                arr[indicePivot] = temp;
                
                // Incrementa o índice do pivot
                indicePivot++;
            }
        }
        
        // Troca o pivot (arr[fim]) com o elemento no índicePivot
        int temp = arr[fim];
        arr[fim] = arr[indicePivot];
        arr[indicePivot] = temp;
        
        // Retorna o índice do pivot após a partição
        return indicePivot;
    }
    
    public static void main(String[] args) {
        // Array dado
        int[] array = {9, 5, 1, 3, 4, 7, 2};
        
        // Chamada para ordenar o array usando Quick-Sort
        quickSort(array, 0, array.length - 1);
        
        // Imprime o array ordenado
        System.out.print("Array ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
/*Explicações:

quickSort(int[] arr, int inicio, int fim): Este método é responsável por ordenar o array dado usando o algoritmo de Quick-Sort. Ele aceita o array, bem como os índices de início e fim do intervalo a ser ordenado. O algoritmo é implementado de forma recursiva.
partition(int[] arr, int inicio, int fim): Esta é uma função auxiliar usada pelo algoritmo Quick-Sort para particionar o array em torno de um elemento pivot. O último elemento do intervalo é escolhido como pivot. Os elementos menores que o pivot são colocados à esquerda, e os maiores à direita. A função retorna o índice do pivot após a partição.
main(String[] args): O método main é onde a execução do programa começa. Aqui, inicializamos o array dado e chamamos o método quickSort() para ordená-lo. Por fim, o array ordenado é impresso na saída padrão.
O algoritmo Quick-Sort é um algoritmo eficiente de ordenação que utiliza a estratégia de divisão e conquista. Ele escolhe um elemento como pivot e particiona o array ao redor deste pivot. Em seguida, ordena recursivamente os subarrays resultantes. */