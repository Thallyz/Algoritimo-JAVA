public class TokenFungivel extends Token{
    private int Qtd;

    public TokenFungivel(String nome, Double valor, int qtd) {
        super(nome, valor);
        Qtd = qtd;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int qtd) {
        Qtd = qtd;
    }

    @Override
    public void mostraDetalhes() {
        super.mostraDetalhes();
        System.out.println("Quantidade do Token Fungivel: "+Qtd);
    }
}

