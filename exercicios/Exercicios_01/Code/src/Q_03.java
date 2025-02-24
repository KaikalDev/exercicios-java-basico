import java.util.Scanner;

/**
 * Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
 * fórmula: área=base X altura
 */

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        int A = sc.nextInt();

        System.out.println("Digite o tamanho da base do retângulo: ");
        int B = sc.nextInt();

        System.out.println("A área do retângulo é: " + (B*A)) ;
    }
}