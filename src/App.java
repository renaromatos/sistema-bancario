public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Cliente 1", "123.456.789.00");
        Cliente cliente2 = new Cliente("Cliente 2", "987.654.321.00");

        ContaCorrente cc = new ContaCorrente(1, cliente1);
        ContaPoupanca cp = new ContaPoupanca(2, cliente2);

        cc.depositar(1000);
        cp.depositar(500);

        cc.sacar(100);
        cp.renderJuros();

        System.out.println("Saldo CC: R$" + cc.getSaldo());
        System.out.println("Saldo CP: R$" + cp.getSaldo());
    }
}
