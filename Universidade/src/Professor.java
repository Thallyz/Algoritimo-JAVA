public class Professor {
    private String nome;
    private String titulacao;
    private int horasPesquisa;

    public Professor(String nome, String titulacao, int horasPesquisa) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.horasPesquisa = horasPesquisa;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {
        System.out.println("Professor: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Horas de Pesquisa: " + horasPesquisa);
    }
}
