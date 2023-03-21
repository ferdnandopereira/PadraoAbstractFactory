public class CarteiraVirtual {
    private String nome;
    private String cpf;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    private Saque saque;
    private Deposito deposito;
    private Extrato extrato;
    public CarteiraVirtual(PagamentoOnline carteiraVirtual){
        this.saque = carteiraVirtual.retirarDinheiro();
        this.deposito = carteiraVirtual.adicionarDinheiro();
        this.extrato = carteiraVirtual.exibirDinheiro();
    }

}
