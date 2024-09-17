public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(int id,String titulo, String autor, boolean disponivel){
        this.id=id;
        this.autor=autor;
        this.titulo=titulo;
        this.disponivel=true;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
