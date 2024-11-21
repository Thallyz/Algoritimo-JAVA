import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criar comprador
        Comprador comprador1 = new Comprador(17); // Menor de idade
        Comprador comprador2 = new Comprador(21); // Maior de idade

        // Criar carrinho
        Carrinho carrinho = new Carrinho(comprador2);

        // Adicionar itens
        Item livro = new Livro("Java Programming", 50.0);
        Item bebida = new Bebida("Cerveja", 5.0, LocalDate.now().plusDays(30));

        carrinho.addItem(livro, 1);
        carrinho.addItem(bebida, 2);

        // Tentar vender bebidas para um menor de idade
        System.out.println("Tentativa de venda para menor:");
        bebida.vender(1, comprador1); // Deve bloquear

        // Tentar vender bebidas para maior de idade
        System.out.println("Tentativa de venda para maior:");
        bebida.vender(1, comprador2); // Deve permitir

        // Pagamento
        Caixa caixa = new Caixa();
        caixa.receber(60.0);

        Pagamento pagamento = new Pix();
        pagamento.processarPagamento(60.0);
        pagamento.confirmarPagamento();

        // Notificar cliente
        Notificador notificador = new Email();
        notificador.enviar("Compra realizada com sucesso!");
    }
}