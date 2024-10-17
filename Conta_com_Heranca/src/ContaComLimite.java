public class ContaComLimite extends Conta {
    protected double limite;

    public ContaComLimite(double saldoInicial) {
        super(saldoInicial);
        this.limite=500.00;
    }
    @Override
    public void sacar(double valor) {
        if(saldo >= valor && valor <= limite){
            saldo -=valor;
            System.out.println("Saque de valor realizado: "+valor+"saldo atual: "+String.format("%.2f", saldo));
        } else if (valor >= limite) {
            System.out.println("Limite Ultrapaçado");
        }else{
            System.out.println("Saldo insuficiente");

        }
    }
}