class Livro extends Item {
    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public boolean vender(int quantidade, Comprador comprador) {
        System.out.println("Venda de livro realizada com sucesso.");
        return true;
    }
}