import java.util.Scanner;

/**
 * Escreva um código onde o usuário informa um número inicial,
 * posteriormente irá informar outros N números,
 * a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0
 * na divisão, números menores que o primeiro número devem ser ignorados
 */

public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int numInicial = sc.nextInt();
        sc.nextLine();

        while (numInicial == 0) {
            System.out.println("O número inicial não pode ser zero. Tente novamente.");
            numInicial = sc.nextInt();
            sc.nextLine();
        }

        while (true) {
            System.out.print("Informe um número: ");
            int num = sc.nextInt();
            sc.nextLine();

            if (num < numInicial) {
                System.out.println("Número ignorado, pois é menor que o número inicial.");
                continue;
            }

            if (num % numInicial != 0) {
                System.out.println("Número " + num + " não é divisível por " + numInicial + ". \nEncerrando execução.");
                break;
            } else {
                System.out.println("Número " + num + " é divisível por " + numInicial + ". \nContinue.");
            }
        }
    }
}