import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nome;
    private ArrayList<Livro> livroAdiquirido;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livroAdiquirido = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Livro> getLivroAdiquirido() {
        return livroAdiquirido;
    }
    public void addLivro(Livro livro){
        livroAdiquirido.add(livro);
    }
    public void removeLivro(Livro livro){
        livroAdiquirido.remove(livro);
    }
}
