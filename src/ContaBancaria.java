public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        if(saldoInicial >= 0){
            this.saldo = saldoInicial;
        }else{
            this.saldo = 0;
            System.out.println("Saldo inicial inválido, definido automaticamente como R$ 0.00");
        }
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        if(titular != null && !titular.isBlank()){
            this.titular = titular;
        }else{
            System.out.println("Nome do titular inválido.");
        }
    }

    public double getSaldo(double valor){
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    public void transferir(ContaBancaria destino, double valor){
        if(valor > 0 && valor <= saldo){
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para" + destino.titular + " realizado com sucesso.");
        }else{
            System.out.println("Não foi possível realizar a tranferência.");
        }
    }

    public String getInformacoes(){
        return "Titular: " + titular + " / Saldo: R$ " + saldo;
    }
}
