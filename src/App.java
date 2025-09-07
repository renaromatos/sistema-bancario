import models.Cliente;
import models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Cliente 1", "123.456.789.00");
        Conta conta1 = new Conta(1, 0, cliente1);

        System.out.println(conta1);

        conta1.depositar(500);
        conta1.sacar(200);
        conta1.sacar(400); //deve lançar o erro

        System.out.println("Saldo final: R$" + conta1.getSaldo());
    }
}
