import java.util.Scanner;

/**
 *Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
 * fórmula: área=lado X lado
 */

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado: ");
        int L = sc.nextInt();

        System.out.println("A área do quadrado é: " + (L*L)) ;

    }
}