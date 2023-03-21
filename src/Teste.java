public class Teste {
    public static void main(String[] args) {
        PagamentoOnline aplicativo1 = new CaixaTem();
        PagamentoOnline aplicativo2 = new PayPal();

        Extrato conta_cliente1 = aplicativo1.exibirDinheiro();
        Extrato conta_cliente2 = aplicativo2.exibirDinheiro();
        Deposito conta_cliente3 = aplicativo1.adicionarDinheiro();
        Deposito conta_cliente4 = aplicativo2.adicionarDinheiro();
        Saque conta_cliente5 = aplicativo1.retirarDinheiro();
        Saque conta_cliente6 = aplicativo2.retirarDinheiro();
    }
}