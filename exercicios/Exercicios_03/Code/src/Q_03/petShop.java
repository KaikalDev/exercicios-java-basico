package Q_03;

/**
 * Escreva um código onde temos o controle de banho de um petshop,
 * a maquina de banhos dos pets deve ter as seguintes operações:
 *  # Dar banho no pet;
 *  # Abastecer com água;
 *  # Abastecer com shampoo;
 *  # verificar nivel de água;
 *  # verificar nivel de shampoo;
 *  # verificar se tem pet no banho;
 *  # colocar pet na maquina;
 *  # retirar pet da máquina;
 *  # limpar maquina.
 * Siga as seguintes regras para implementação
 * -
 *  # A maquina de banho deve permitir somente 1 pet por vez;
 *  # Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
 *  # A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
 *  # Se o pet for retirado da maquina sem estar limpo será necessário
 *  limpar a máquina para permitir a entrada de outro pet;
 *  # A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
 *  # O abastecimento de água e shampoo deve permitir 2 litros
 *  por vez que for acionado;
 */
public class petShop {

    private int nivelShampoo;

    private int nivelAgua;

    private boolean ocupada;

    public void abastecerAgua() {
        if (nivelAgua + 2 > 30) {
            System.out.println("Nivel maximo de agua");
        } else {
            nivelAgua += 2;
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + 2 > 10) {
            System.out.println("Nivel maximo de shampoo");
        } else {
            nivelShampoo += 2;
        }
    }

    public int verificarAgua() {
        System.out.println("O Nivel da agua é de " + nivelAgua + "L");
        return nivelAgua;
    }

    public int verificarShampoo() {
        System.out.println("O Nivel do shampoo é de " + nivelShampoo + "L");
        return nivelShampoo;
    }

    public boolean verificarOcupada() {
        if (ocupada) {
            System.out.println("Ocupada");
        } else {
            System.out.println("Vazio");
        }
        return ocupada;
    }

    public void colocarPet() {
        ocupada = true;
    }

    public void retirarPet() {
        ocupada = false;
    }

    public void limpar() {
        if (!ocupada) {
            nivelAgua -= 3;
            nivelShampoo--;
            System.out.println("Maquina Limpa");
        } else {
            System.out.println("Maquina ocupada");
        }
    }

    public void banho() {
        if (!ocupada) {
            if (verificarAgua() >= 13 && verificarShampoo() >= 3) {
                colocarPet();
                nivelAgua -= 10;
                nivelShampoo -= 2;
                System.out.println("banho Finalizado");
                retirarPet();
                limpar();
            } else {
                System.out.println("Nivel de shampoo e agua baixo");
            }
        } else {
            System.out.println("Maquina ocupada");
        }
    }

}
