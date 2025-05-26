public class POOContaBanco {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.setTitular("João Silva");

        conta.depositar(500);
        conta.sacar(200);
        conta.exibirInformacoesConta();
    }
}
