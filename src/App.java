public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria("cliente 1", 1000);
        ContaBancaria conta2 = new ContaBancaria("cliente 2", 50);

        System.out.println(conta1.getInformacoes());
        System.out.println(conta2.getInformacoes());

        conta1.transferir(conta2, 200);

        System.out.println(conta1.getInformacoes());
        System.out.println(conta2.getInformacoes());

        conta2.setTitular("Novo Cliente");
        System.out.println(conta2.getInformacoes());
    }
}
