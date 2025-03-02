package Q_02;

public class adendente extends Funcionario {

    private double valorCaixa;

    protected adendente() {
        super(false);
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public void pagamento(int valor) {
        this.valorCaixa += valor;
    }

    public void fecharCaixa() {}

}
