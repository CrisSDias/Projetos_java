public class QuickSort {
    public static void quickSort(int vetor[], int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, pivo - 1);
            quickSort(vetor, pivo + 1, direita);
        }
    }

    private static int particao(int[] vetor, int esquerda, int direita) {
        int pivo = vetor[direita];
        int i = esquerda - 1;
        for (int j = esquerda; j < direita; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }
        int aux = vetor[i + 1];
        vetor[i + 1] = vetor[direita];
        vetor[direita] = aux;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
