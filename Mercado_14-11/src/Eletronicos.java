class Eletronicos extends Item {
    public Eletronicos(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public boolean vender(int quantidade, Comprador comprador) {
        System.out.println("Venda de eletrônico realizada com sucesso.");
        return true;
    }
}