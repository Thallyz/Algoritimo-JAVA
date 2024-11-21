class Boleto extends Pagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento processado via Boleto: R$" + valor);
        return true;
    }

    @Override
    public boolean confirmarPagamento() {
        System.out.println("Pagamento confirmado via Boleto.");
        return true;
    }
}