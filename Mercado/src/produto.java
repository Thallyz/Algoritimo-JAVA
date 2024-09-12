public class produto {
    private String nome;
    private double preco;

    public produto(String nome, Double preco){
        this.nome=nome;
        this.preco=preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString(){
        return nome +" - R$"+preco;
    }

    public void add(produto produto) {
    }
}