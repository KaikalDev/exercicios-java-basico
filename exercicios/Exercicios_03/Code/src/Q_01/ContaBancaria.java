package Q_01;

/**
 * Escreva um código onde temos uma conta bancaria que possa realizar as
 * seguintes operações:
 *  # Consultar saldo
 *  # consultar cheque especial
 *  # Depositar dinheiro;
 *  # Sacar dinheiro;
 *  # Pagar um boleto.
 *  # Verificar se a conta está usando cheque especial.
 *  -
 * Siga as seguintes regras para implementar
 *  -
 *  # A conta bancária deve ter um limite de cheque
 *  especial somado aosaldo da conta;
 *  # O o valor do cheque especial é definido no momento da criação
 *  da conta, de acordo com o valor depositado na conta em sua criação;
 *  # Se o valor depositado na criação da conta for de R$500,00 ou menos o
 *  cheque especial deve ser de R$50,00
 *  # Para valores acima de R$500,00 o cheque especial deve
 *  ser de 50% do valor depositado;
 *  # Caso o limite de cheque especial seja usado, assim que possível
 *  a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
 */

public class ContaBancaria {
    private Double saldo;

    private Double limite;

    private Double chequeEspecialUsado;

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
        this.limite = saldo <= 500 ? 50 : (saldo*0.5);
        this.chequeEspecialUsado = 0D;
    }

    public Double consultarSaldo() {
        return saldo;
    }

    public Double consultarChequeEspecial() {
        return limite - chequeEspecialUsado;
    }

    public void depositar(Double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ "+ valor +" realizado com sucesso.");
    }

    public void sacar(Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else if (valor <= saldo + limite - chequeEspecialUsado) {
            double valorCheque = valor - saldo;
            saldo = 0D;
            chequeEspecialUsado = valorCheque;
            System.out.println("Saque de R$ " + valor + " realizado usando o cheque especial.");
            System.out.println("Cheque especial utilizado: R$ " + valorCheque + " .");
            System.out.println("Saldo atual: R$ " + consultarSaldo() + ".");
        } else {
            System.out.println("Saldo insuficiente e limite do cheque especial excedido.");
        }
    }

    public void pagarBoleto(Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento de boleto no valor de R$ " + valor + " realizado.");
        } else if (valor <= saldo + limite - chequeEspecialUsado) {
            double valorCheque = valor - saldo;
            saldo = 0D;
            chequeEspecialUsado = valorCheque;
            System.out.println("Pagamento de boleto no valor de R$ " + valor + " realizado usando o cheque especial.");
            System.out.println("Cheque especial utilizado: R$ " + valorCheque + " .");
            System.out.println("Saldo atual: R$ " + consultarSaldo() + ".");
        } else {
            System.out.println("Saldo insuficiente e limite do cheque especial excedido para pagamento do boleto.");
        }
    }

    public boolean verificarUsoChequeEspecial() {
        return chequeEspecialUsado > 0;
    }

    public void cobrarTaxaChequeEspecial() {
        double taxaCheque = chequeEspecialUsado * 0.2;
        chequeEspecialUsado -= taxaCheque;
        System.out.println("Taxa de utilização do cheque especial cobrada: R$" + taxaCheque + ".");
    }
}
