public class Token {
    protected String nome;
    protected Double valor;

    public Token(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void mostraDetalhes(){
        System.out.println("Nome do Token: "+nome);
        System.out.println("Valor do token: "+valor);
    }
}
