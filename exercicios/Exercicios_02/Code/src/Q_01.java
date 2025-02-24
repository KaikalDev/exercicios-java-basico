import java.util.Scanner;

/**
 * Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 */

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ser gerada sua tabuada: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}