public class TokenMain {
    public static void main(String[]args){
    TokenFungivel tokenA=new TokenFungivel("Token A",256.0,50);
    tokenA.mostraDetalhes();

    TokenNaoFungivel tokenB= new TokenNaoFungivel("Token B",1500.00, "987654321123456789");
    tokenB.mostraDetalhes();
        System.out.println("\n");

        //outros tipos de consutar os dados.

        System.out.println(tokenA.getClass());
        System.out.println(tokenA.getNome());
        System.out.println(tokenA.getValor());
        System.out.println(tokenA.getQtd()+"\n");

        System.out.println(tokenB.getClass());
        System.out.println(tokenB.getNome());
        System.out.println(tokenB.getValor());
        System.out.println(tokenB.getIdUnico());

    }
}