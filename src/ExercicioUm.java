import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" 1 - Soma (+)");
        System.out.println(" 2 - Subtração (-)");
        System.out.println(" 3 - Multiplicação (*)");
        System.out.println(" 4 - Divisão (/)");
        System.out.println(" 0 - para sair");

        System.out.print("Escolha a operação: ");
        int opcao = entrada.nextInt();

        while (opcao != 0) {

            System.out.print("Digite o primeiro número número: ");
            int numUm = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            int numDois = entrada.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + numUm + numDois);
                    break;

                case 2:
                    System.out.println("Resultado: " + (numUm - numDois));
                    break;

                case 3:
                    System.out.println("Resultado: " + numUm * numDois);
                    break;

                case 4:
                    if(numDois == 0) {
                        System.out.println("Operação não pode ser realizada! ");
                    } else {
                        System.out.println(numUm / numDois);
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }

            System.out.print("Escolha a operação: ");
            opcao = entrada.nextInt();
        }
            System.out.println("Finalizado");
        }

    }





