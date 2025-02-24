import java.time.LocalDate;
import java.util.Scanner;

/**
 * Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
 */

public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name1 = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do seu amigo: ");
        String name2 = sc.nextLine();

        System.out.println("Digite a idade do seu amigo: ");
        int idade2 = sc.nextInt();
        sc.nextLine();

        if (idade1 > idade2) {
            System.out.println(name1 + " é " + (idade1 - idade2) + " anos mais velho(a) que " + name2 );
        } else if (idade1 < idade2) {
            System.out.println(name2 + " é " + (idade2 - idade1) + " anos mais velho(a) que " + name1 );
        } else {
            System.out.println(name1 + " e " + name2 + " tem a mesma idade");
        }

    }
}