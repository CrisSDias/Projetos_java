//Crie um vetor (vet_1) de inteiros com tamanho 100, insira os números de 1 até 100 em ordem crescente e, depois, crie outro vetor (vet_2) com o valor inverso do primeiro vetor. Depois de inserir, crie um terceiro vetor (vet_3) que armazena a média dos vetores vet.-1 e vet_2. No final, mostre os valores dos vetores 1, 2 e 3.
public class Vetor {
    
    public static void main(String[] args) {
        int vet_1[] = new int[100];
        int vet_2[] = new int[100];
        double vet_3[] = new double[100];

        // Preencher vet_1 com números de 1 a 100
        for (int i = 0; i < 100; i++) {
            vet_1[i] = i + 1;
        }

        // Preencher vet_2 com o inverso de vet_1
        for (int i = 0; i < 100; i++) {
            vet_2[i] = vet_1[99 - i];
        }

        // Calcular a média entre vet_1 e vet_2 e armazenar em vet_3
        for (int i = 0; i < 100; i++) {
            vet_3[i] = (vet_1[i] + vet_2[i]) / 2.0;
        }

        // Mostrar os valores dos vetores
        System.out.println("Vetor 1:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vet_1[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor 2:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vet_2[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor 3:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vet_3[i] + " ");
        }
        System.out.println();



    }
}   


