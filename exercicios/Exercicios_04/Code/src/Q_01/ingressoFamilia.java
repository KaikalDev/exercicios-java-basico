package Q_01;

public class ingressoFamilia extends Ingresso {

    private int qtdPessoas;

    @Override
    public Double getRealValor() {
        double total = getValor() * qtdPessoas;

        if (qtdPessoas > 3) {
            double desconto = qtdPessoas * 0.05;
            total *= (1 - desconto);
        }

        return total;
    }
}
