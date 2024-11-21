class Cartao extends Pagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento processado via Cartão: R$" + valor);
        return true;
    }

    @Override
    public boolean confirmarPagamento() {
        System.out.println("Pagamento confirmado via Cartão.");
        return true;
    }
}