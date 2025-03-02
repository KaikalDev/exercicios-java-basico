package Q_02;

public class vendedor extends Funcionario {

    private int qtdVendas;

    protected vendedor() {
        super(false);
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public void realizarVenda() {
        qtdVendas++;
    }

    public void consultarVendas() {}
}
