public class recursao {
    public static void rec(int i) {
        System.out.println(i);
        if(i == 0) {
                return;
            }  else
                rec(i-1);        
    
    }

public static void main(String[]args) {
   
   // int i=10;

    for(int i =10 ;i>=0;i--) {

    System.out.println(i); 
    }
         rec(10);
    }
}   



/*
public static void main(String[] args){} é uma assinatura de método em Java, que é a entrada principal para a execução de um programa Java. Aqui está o significado de cada parte:

public: é um modificador de acesso que indica que o método é acessível de qualquer outra classe.
static: indica que o método pertence à classe em vez de instâncias individuais da classe. Isso significa que o método pode ser chamado sem criar uma instância da classe em que está definido.
void: é o tipo de retorno do método, o que significa que o método não retorna nenhum valor.
main: é o nome do método. O método main é o ponto de entrada para qualquer aplicativo Java. É onde a execução do programa Java começa.
(String[] args): é o parâmetro do método. Aqui, args é um array de strings que contém os argumentos de linha de comando passados para o programa quando ele é executado.
Por outro lado, public static void nome(String[] args){} é apenas uma assinatura de método genérica que tem um nome diferente (nome neste caso) e também aceita um array de strings como argumento, mas não necessariamente serve como o ponto de entrada principal do programa Java. O nome do método pode ser qualquer nome válido em Java e não precisa ser main. */