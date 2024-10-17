import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma Conta Corrente
        System.out.println("Criando uma Conta Corrente:");
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        contaCorrente.sacar(200);
        contaCorrente.depositar(150);

        // Criando uma Conta com Limite
        System.out.println("\nCriando uma Conta com Limite:");
        ContaComLimite contaLimite = new ContaComLimite(501);
        contaLimite.sacar(500);
        contaLimite.depositar(100);

        // Criando uma Conta com Rendimento
        System.out.println("\nCriando uma Conta com Rendimento:");

        ContaBonus contaRendimento = new ContaBonus(1000);

        contaRendimento.aplicarRendimento();
        contaRendimento.sacar(200);
        contaRendimento.aplicarRendimento();


        scanner.close();
    }
}
abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de: " + valor + " realizado. Saldo atual: " + saldo);
    }

    public abstract void sacar(double valor);

}