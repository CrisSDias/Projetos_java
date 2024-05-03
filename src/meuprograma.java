public class meuprograma {
    public static void main(String[] args) {
        System.out.println("Início do programa.");

        // Chamada de outros métodos
        metodo1();
        metodo2();

        // Criação de objetos e execução de operações
        MinhaClasse objeto = new MinhaClasse();
        objeto.executar();

        System.out.println("Fim do programa.");
    }

    public static void metodo1() {
        System.out.println("Executando o método 1.");
    }

    public static void metodo2() {
        System.out.println("Executando o método 2.");
    }
}

class MinhaClasse {
    public void executar() {
        System.out.println("Executando o método 'executar' da classe MinhaClasse.");
    }
}
