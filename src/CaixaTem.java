public class CaixaTem implements PagamentoOnline{
    @Override
    public Saque retirarDinheiro() {
        return new Saque24horas();
    }

    @Override
    public Deposito adicionarDinheiro() {
        return new Boleto();
    }

    @Override
    public Extrato exibirDinheiro() {
        return new Demostrativo();
    }
}
