public class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }
    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            saldo -=valor;
            System.out.println("Saque de valor realizado: "+valor+"saldo atual: "+String.format("%.2f", saldo));
        }else{
            System.out.println("Saldo insuficiente");
        }

    }
}