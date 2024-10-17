class ContaBonus extends Conta {
    double taxaderendimento;
    public ContaBonus(double saldoInicial) {
        super(saldoInicial);
        this.taxaderendimento=0.012345;
    }  @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            saldo -=valor;
            System.out.println("Saque de valor realizado: "+valor+"saldo atual: "+ String.format("%.2f", saldo));
        }else{
            System.out.println("Saldo insuficiente");
        }

    }
    public void aplicarRendimento() {

        saldo += saldo * taxaderendimento;
        System.out.println("Rendimento aplicado. Saldo atual: "+String.format("%.2f", saldo));
    }
}