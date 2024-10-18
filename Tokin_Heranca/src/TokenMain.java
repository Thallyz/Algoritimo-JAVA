public class TokenMain {
    public static void main(String[]args){
    TokenFungivel tokenA=new TokenFungivel("Token A",256.0,50);
    tokenA.mostraDetalhes();

    TokenNaoFungivel tokenB= new TokenNaoFungivel("Token B",1500.00, "987654321123456789");
    tokenB.mostraDetalhes();
    }
}