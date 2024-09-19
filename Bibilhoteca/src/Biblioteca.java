import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro>livros;
    private ArrayList<Usuario>usuarios;
    private ArrayList<Emprestimo>emprestimos;

    public Biblioteca() {
        this.livros=new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void cadastraLivro(Livro livros) {
        this.livros.add(livros);
    }

    public void cadastraUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    public void emprestarLivro(int livroId, int usuarioId) {
        Livro livro = buscarIdLivro(livroId);
        Usuario usuario = buscarIdUsuario(usuarioId);

        if (livro != null && usuario != null && livro.estaDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, usuario); // 7 dias fixos
            livro.setDisponivel(false);
            usuario.getLivroAdiquirido().add(livro);
            System.out.println("Livro emprestado: " + livro.getTitulo() + " para " + usuario.getNome() +
                    ". Devolução em: " + emprestimo.getDataDevolucao());
        } else {
            System.out.println("Empréstimo não pode ser realizado.");
        }
    }

    public Livro buscarIdLivro(int id){
        for (Livro livro: livros){
            if(livro.getId()==id){
                return livro;
            }
        }
        return null;
    }
    public Usuario buscarIdUsuario(int id){
        for (Usuario usuario:usuarios){
            if(usuario.getId()==id){
                return usuario;
            }
        }
        return null;
    }
    public void devolverLivro(int id_livro, int id_usuario){
        Usuario usuario = buscarIdUsuario(id_usuario);
        Livro livro = buscarIdLivro(id_livro);

        if (livro != null && usuario !=null){
            livro.setDisponivel(true);
            usuario.removeLivro(livro);
            System.out.println("Livro Devolvido");
        }else{
            System.out.println("Ainda não devolvido");
        }

    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
