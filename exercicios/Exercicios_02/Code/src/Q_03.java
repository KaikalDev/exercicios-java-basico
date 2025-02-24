import java.util.Objects;
import java.util.Scanner;

/**
 * Escreva um código que o usuário entre com um primeiro número,
 * um segundo número maior que o primeiro e escolhe entre a opção par e impar,
 * com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
 * no intervalo de números informados, incluindo os números informados e em ordem decrescente;
 */

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        sc.nextLine();

        int num2;
        do {
            System.out.print("Digite um numero maior: ");
            num2 = sc.nextInt();
            sc.nextLine();
        } while (num > num2);

        String parOrImpar;
        do {
            System.out.print("Ecolha entre par ou impar: ");
            parOrImpar = sc.nextLine();
        } while (parOrImpar != null && !parOrImpar.isEmpty() && !parOrImpar.equals("par") && !parOrImpar.equals("impar"));

        System.out.println("Numeros " + parOrImpar + "es de " + num2 + " a " + num);
        System.out.print("[ ");
        for (int i = num2; i >= num; i--) {
            switch (Objects.requireNonNull(parOrImpar)) {
                case "par":
                    if (i % 2 == 0) {
                        System.out.print(i + ", ");
                    }
                    break;
                case "impar":
                    if (i % 2 != 0) {
                        System.out.print(i + ", ");
                    }
            }
        }

        System.out.print("]");
    }
}