public class Main {

    public static void merge(int array[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int array[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(array, l, m);
            sort(array, m + 1, r);

            merge(array, l, m, r);
        }
    }

    public static void mostraArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + " }");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void main(String args[]) {
        int array[] = {5, 2, 9, 1, 5};

        System.out.print("Array Desordenado = {");
        mostraArray(array);

        sort(array, 0, array.length - 1);

        System.out.println();
        System.out.print("Array Ordenado = { ");
        mostraArray(array);
    }
}
