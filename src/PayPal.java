public class PayPal implements PagamentoOnline{
    @Override
    public Saque retirarDinheiro() {
        return new DepositoDireto();
    }

    @Override
    public Deposito adicionarDinheiro() {
        return new Ted();
    }

    @Override
    public Extrato exibirDinheiro() {
        return new Demostrativo();
    }
}
