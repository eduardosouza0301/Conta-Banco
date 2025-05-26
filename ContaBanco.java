class ContaBanco {

    private String titular;
    private double saldo;

    public void setTitular(String nome) {
        this.titular = nome;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            exibirSaldo();
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            exibirSaldo();
        } else {
            System.out.println("Saque inválido.");
        }
    }

    private void exibirSaldo() {
        System.out.println("Saldo atual: R$" + this.getSaldo());
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void exibirInformacoesConta() {
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: R$" + this.getSaldo());
    }
}

