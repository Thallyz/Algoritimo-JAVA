import java.time.LocalDateTime;

abstract class Item {
    protected String nome;
    protected double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract boolean vender(int quantidade, Comprador comprador);
}
