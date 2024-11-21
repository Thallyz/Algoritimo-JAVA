class Pix extends Pagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento processado via Pix: R$" + valor);
        return true;
    }

    @Override
    public boolean confirmarPagamento() {
        System.out.println("Pagamento confirmado via Pix.");
        return true;
    }
}