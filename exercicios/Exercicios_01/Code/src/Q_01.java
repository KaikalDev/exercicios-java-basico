import java.time.LocalDate;
import java.util.Scanner;

/**
 * Escreva um código que receba o nome e o ano de nascimento de
 * alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite seu ano de nascimento: ");
        int ano = sc.nextInt();

        int actualYear = LocalDate.now().getYear();

        System.out.println("Olá " + name + " você tem " + (actualYear - ano) + " anos");
    }
}