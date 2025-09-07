public class ContaPoupanca extends Conta{
    private static final double TAXA_JUROS = 0.02;

    public ContaPoupanca(int numero, Cliente cliente){
        super(numero, numero, cliente);
    }

    public void renderJuros(){
        double rendimento = saldo * TAXA_JUROS;
        saldo += rendimento;
        System.out.println("Rendimento aplicado: R$" + rendimento);
    }
}
