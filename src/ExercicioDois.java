import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite o valor de Saque: ");
        int valor = Scanner.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        int[] quantidadeDeNotas = new int[notas.length];

        for (int i = 0; i < notas.length; i++) {

            quantidadeDeNotas[i] = valor / notas[i];
            valor = valor % notas[i];
        }

        System.out.println("\nQuantidade de notas: ");

        for (int i = 0; i < notas.length; i++) {
            if (quantidadeDeNotas[i] > 0) {
                System.out.println(notas[i] + ": " + quantidadeDeNotas[i]);
            }
        }
        Scanner.close();
    }
}
