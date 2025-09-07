public class Conta {
    private int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$:" + valor + " realizado com sucesso.");
        }else{
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta destino){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para conta: " + destino.getNumero());
        }else{
            System.out.println("Transferência não realizada. Verifique seu saldo e tente novamente.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String toString(){
        return "Conta " + numero + " - Cliente: " + cliente.getNome() + " - Saldo: R$" + saldo;
    }
    
}
