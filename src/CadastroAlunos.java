import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        // Criando um array para armazenar os cadastros dos alunos
        Aluno[] alunos = new Aluno[25];
        Scanner scanner = new Scanner(System.in);

        // Preenchendo o array com os dados dos alunos
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Cadastro do Aluno " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner

            // Criando um objeto Aluno com os dados fornecidos e adicionando ao array
            alunos[i] = new Aluno(nome, idade, curso, nota);
        }

        // Exibindo os dados dos alunos cadastrados
        System.out.println("\nLista de Alunos Cadastrados:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Idade: " + alunos[i].getIdade());
            System.out.println("Curso: " + alunos[i].getCurso());
            System.out.println("Nota: " + alunos[i].getNota());
            System.out.println("-----------------------");
        }

        scanner.close();
    }
}

// Classe Aluno para representar cada aluno
class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double nota;

    // Construtor
    public Aluno(String nome, int idade, String curso, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.nota = nota;
    }

    // Métodos para acessar os atributos (getters)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public double getNota() {
        return nota;
    }
}
