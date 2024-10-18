public class TokenNaoFungivel extends Token{
    protected String idUnico;

    public TokenNaoFungivel(String nome, Double valor, String idUnico) {
        super(nome, valor);
        this.idUnico = idUnico;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(String idUnico) {
        this.idUnico = idUnico;
    }

    @Override
    public void mostraDetalhes() {
        super.mostraDetalhes();
        System.out.println("ID Único do Token não Fungivel: "+ idUnico);
    }
}
