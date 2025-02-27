package Q_02;

/**
 * Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
 *  # Ligar o carro;
 *  # Desligar o carro;
 *  # Acelerar;
 *  # diminuir velocidade;
 *  # virar para esquerda/direita
 *  # verificar velocidade;
 *  # trocar a marcha
 *  -
 * Siga as seguintes regras na implementação
 * -
 *  # Quando o carro for criado ele deve começar desligado,
 *  em ponto morto e com sua velocidade em 0
 *  # O carro desligado não pode realizar nenhuma função;
 *  # Quando o carro for acelerado ele deve incrementar 1km
 *  em sua velocidade (pode chegar no máximo a 120km);
 *  # Quando diminuir a velocidade do carro ele deve
 *  decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
 *  # o carro deve possuir 6 marchas, não deve ser permitido
 *  pular uma marcha no carro;
 *  # A velocidade do carro deve respeitar os seguintes
 *  limites para cada velocidade
 * se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
 * se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
 * se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
 * se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
 * se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
 * se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
 * se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
 * O carro podera ser desligado se estiver em ponto morto (marcha 0) e
 * sua velocidade em 0 km
 * O carro só pode virar para esquerda/direita se sua
 * velocidade for de no mínimi 1km e no máximo 40km;
 */
public class Carro {
    private int marcha;

    private int velocidade;

    private boolean ligado;

    public Carro() {
        marcha = 0;
        velocidade = 0;
        ligado = false;
    }

    public void ligarCarro() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro Ligado");
        } else {
            System.out.println("O carro já esta ligado.");
        }
    }

    public void desligarCarro() {
        if (ligado) {
            if (marcha == 0 && velocidade == 0) {
                ligado = false;
                System.out.println("Carro Desligado");
            } else {
                System.out.println("O carro deve estar em ponto morto.");
            }
        } else {
            System.out.println("O carro já esta desligado.");
        }
    }

    public void acelerarCarro() {
        if (ligado && marcha > 0) {
            if (testMarcha(velocidade++)) {
                trocarMarcha(marcha++);
            }
            velocidade++;
        } else {
            System.out.println("O carro esta desligado ou em ponto morto.");
        }
    }

    public void diminuirVelocidade() {
        if (ligado && marcha > 0) {
            if (testMarcha(velocidade--)) {
                trocarMarcha(marcha--);
            }
            velocidade--;
        } else {
            System.out.println("O carro esta desligado ou em ponto morto.");
        }
    }

    public void virarParaEsquerdaDireita() {
        if (ligado && marcha > 0) {
            if (velocidade > 0 && velocidade <= 40) {
                System.out.println("virando para esquerda/direita\n");
            } else {
                System.out.println("minimo 1km e no máximo 40km.");
            }
        } else {
            System.out.println("O carro esta desligado ou em ponto morto.");
        }
    }

    public int verificarVelocidade() {
        System.out.println("O carro esta a " + velocidade + "km");
        return velocidade;
    }

    public void trocarMarcha(int marcha) {
        this.marcha = marcha;
        System.out.println("Troca de marcha: " + marcha);
    }

    public boolean testMarcha(int velocidade) {
        switch (marcha) {
            case 1:
                if(velocidade >= 0 && velocidade <= 20) {
                    return false;
                }
                break;
            case 2:
                if(velocidade >= 21 && velocidade <= 40) {
                    return false;
                }
                break;
            case 3:
                if(velocidade >= 41 && velocidade <= 60) {
                    return false;
                }
                break;
            case 4:
                if(velocidade >= 61 && velocidade <= 80) {
                    return false;
                }
                break;
            case 5:
                if(velocidade >= 81 && velocidade <= 100) {
                    return false;
                }
                break;
            case 6:
                if(velocidade >= 101 && velocidade <= 120) {
                    return false;
                }
                break;
        }
        return true;
    }
}
