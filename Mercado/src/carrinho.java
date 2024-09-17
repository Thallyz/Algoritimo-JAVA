import java.util.ArrayList;
import java.util.List;

public class carrinho {
    private List<produto> produtos;

    public carrinho() {
        this.produtos=new ArrayList<>();}
    public void adicionarProduto(produto produto){
        produtos.add(produto);}
    public void removerProduto(produto produto){
        produtos.remove(produto);}
    public double calcularTotal(){
        double total=0;
        for(produto produto: produtos){
            total += produto.getPreco();}
        return total;}

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Carrinho:\n");
        for(produto produto:produtos){
            sb.append(produto).append("\n");}
        sb.append("Total: R$").append(calcularTotal());
        return sb.toString();}}