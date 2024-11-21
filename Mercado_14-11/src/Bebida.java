import java.time.LocalDate;

class Bebida extends Alimento {
    public Bebida(String nome, double preco, LocalDate dataValidade) {
        super(nome, preco);
    }

    @Override
    public boolean vender(int quantidade, Comprador comprador) {
        if (comprador.getIdade() < 18) {
            System.out.println("Venda proibida: comprador menor de idade.");
            return false;
        }
        System.out.println("Venda de bebida realizada com sucesso.");
        return true;
    }
}
