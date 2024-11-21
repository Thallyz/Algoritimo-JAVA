import java.util.ArrayList;

class Carrinho {
    private ArrayList<Item> produtos;
    private Comprador cliente;

    public Carrinho(Comprador cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public boolean addItem(Item item, int quantidade) {
        System.out.println("Item adicionado ao carrinho: " + item.nome);
        produtos.add(item);
        return true;
    }
}