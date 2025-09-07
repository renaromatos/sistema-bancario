public class ContaCorrente extends Conta{
    private static final double TAXA_SAQUE = 1.0;

    public ContaCorrente(int numero, Cliente cliente){
        super(numero, numero, cliente);
    }

    @Override
    public void sacar(double valor){
        double valorTotal = valor + TAXA_SAQUE;
        if(valorTotal <= saldo){
            saldo -= valorTotal;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. (Taxa de saque R$: " + TAXA_SAQUE + ")");
        }else{
            System.out.println("Saldo insuficiente para saque (incluindo taxa).");
        }
    }
    
}
