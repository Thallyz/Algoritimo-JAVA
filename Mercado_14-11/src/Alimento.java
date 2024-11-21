import java.time.LocalDate;

class Alimento extends Item {
    private LocalDate fabricaçao;
    private LocalDate dataValidade;

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getFabricaçao() {
        return fabricaçao;
    }

    public void setFabricaçao(LocalDate fabricaçao) {
        this.fabricaçao=LocalDate.now();
    }

    public Alimento(String nome, double preco) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean vender(int quantidade, Comprador comprador) {
        System.out.println("Venda de alimento realizada com sucesso.");
        return true;
    }
}