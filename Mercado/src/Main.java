public class Main{
    public static void main(String[] args){
        produto produto1=new produto("Camiseta Polo", 40.95);
        produto produto2=new produto("Calça Jeans",85.50);
        cliente cliente =new cliente("Joao ", "josa@gmial.com");
        carrinho carrinho =new carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto2);
        System.out.println(cliente);
        System.out.println(carrinho);
    }}