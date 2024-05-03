public class mySelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // Itera sobre todo o array
        for (int i = 0; i < n - 1; i++) {
            // Encontra o índice do menor elemento restante
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Troca o menor elemento com o primeiro não ordenado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        // Array dado
        int[] array = {9, 5, 1, 3, 4, 7, 2};
        
        // Chamada para ordenar o array usando Selection-Sort
        selectionSort(array);
        
        // Imprime o array ordenado
        System.out.print("Array ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/* Explicações:

selectionSort(int[] arr): Este método é responsável por ordenar o array dado usando o algoritmo de Selection-Sort. Ele aceita um array de inteiros como entrada e modifica o array fornecido para ordená-lo em ordem crescente.
main(String[] args): O método main é onde a execução do programa começa. Aqui, inicializamos o array dado e chamamos o método selectionSort() para ordená-lo. Por fim, o array ordenado é impresso na saída padrão.
Algoritmo Selection-Sort: O algoritmo percorre o array iterativamente e, em cada iteração, encontra o índice do menor elemento restante no array não ordenado. Em seguida, troca esse menor elemento com o primeiro elemento não ordenado. Esse processo é repetido até que todo o array esteja ordenado.

*/