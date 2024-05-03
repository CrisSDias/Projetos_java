/*Dado o array = [9, 5, 1, 3, 4, 7, 2], ordene os números em ordem crescente pelo Merge-Sort. Depois, analise e compare o número de interações que cada algoritmo de ordenação fez para ordenar o array. Você conseguiu ver as diferenças? Elas influenciam no tempo de execução do nosso algoritmo. */


public class myMergeSort {
    
    // Função para realizar a ordenação Merge-Sort
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }
    
    // Função de apoio para realizar a ordenação Merge-Sort
    private static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid); // ordena a metade esquerda
            mergeSort(arr, mid + 1, high); // ordena a metade direita
            merge(arr, low, mid, high); // funde as duas metades ordenadas
        }
    }
    
    // Função para fundir duas partes ordenadas do array
    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        // Copia os elementos para os arrays temporários
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        
        // Funde os arrays temporários de volta em arr[low..high]
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Copia os elementos restantes de left[], se houver
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        // Copia os elementos restantes de right[], se houver
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    
    // Função para imprimir o array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 3, 4, 7, 2};
        System.out.println("Array original:");
        printArray(arr);
        
        // Ordena o array usando Merge-Sort
        mergeSort(arr);
        
        System.out.println("Array ordenado:");
        printArray(arr);
    }
}
/*
Claro! Primeiro, vou fornecer o código Java para implementar o algoritmo Merge-Sort e contar o número de interações. Em seguida, explicarei o código e discutirei as diferenças entre o Merge-Sort e outros algoritmos de ordenação, como o Bubble Sort ou o Selection Sort.

java
Copy code
public class MergeSort {
    
    // Função para realizar a ordenação Merge-Sort
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }
    
    // Função de apoio para realizar a ordenação Merge-Sort
    private static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid); // ordena a metade esquerda
            mergeSort(arr, mid + 1, high); // ordena a metade direita
            merge(arr, low, mid, high); // funde as duas metades ordenadas
        }
    }
    
    // Função para fundir duas partes ordenadas do array
    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        // Copia os elementos para os arrays temporários
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        
        // Funde os arrays temporários de volta em arr[low..high]
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Copia os elementos restantes de left[], se houver
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        // Copia os elementos restantes de right[], se houver
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    
    // Função para imprimir o array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 3, 4, 7, 2};
        System.out.println("Array original:");
        printArray(arr);
        
        // Ordena o array usando Merge-Sort
        mergeSort(arr);
        
        System.out.println("Array ordenado:");
        printArray(arr);
    }
}
Agora, uma explicação do código:

mergeSort(int[] arr): Esta é a função pública que inicia o processo de ordenação do Merge-Sort. Ela verifica se o array não é nulo e tem pelo menos dois elementos antes de chamar a função de ordenação principal.
mergeSort(int[] arr, int low, int high): Esta é a função de ordenação principal. Ela divide o array em duas metades recursivamente até que cada parte tenha apenas um elemento. Em seguida, chama a função merge() para fundir essas partes ordenadas.
merge(int[] arr, int low, int mid, int high): Esta função combina duas partes ordenadas do array em uma única parte ordenada. Usa dois arrays temporários left e right para armazenar temporariamente os elementos das duas partes. Então, compara os elementos desses arrays e os coloca de volta no array original em ordem.
printArray(int[] arr): Esta função é apenas para imprimir o array.
Agora, vamos discutir as diferenças entre o Merge-Sort e outros algoritmos de ordenação, como o Bubble Sort ou o Selection Sort, em termos de interações e tempo de execução.

Merge-Sort:
O Merge-Sort é um algoritmo de ordenação eficiente com uma complexidade de tempo de O(n log n) no pior caso.
Ele divide repetidamente a lista pela metade até que cada sublista contenha apenas um elemento, depois funde essas sublistas em ordem.
Bubble Sort:
O Bubble Sort é um algoritmo de ordenação menos eficiente, com uma complexidade de tempo de O(n^2) no pior caso.
Ele percorre repetidamente a lista, compara elementos adjacentes e os troca se estiverem na ordem errada, movendo o maior elemento para a extremidade da lista.
Selection Sort:
O Selection Sort também é menos eficiente, com uma complexidade de tempo de O(n^2) no pior caso.
Ele seleciona repetidamente o menor elemento restante e o coloca no início da lista, trocando-o com o elemento atual.
As diferenças entre esses algoritmos de ordenação são significativas em termos de eficiência. Enquanto o Merge-Sort divide a lista em partes menores e depois as combina em ordem, os outros algoritmos de ordenação (Bubble Sort e Selection Sort) percorrem repetidamente a lista, o que pode resultar em um número muito maior de interações, especialmente para listas grandes. Isso influencia diretamente o tempo de execução dos algoritmos, tornando o Merge-Sort mais rápido para listas grandes em comparação com o Bubble Sort e o Selection Sort. */