import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro>livros;
    private ArrayList<Usuario>usuarios;
    private ArrayList<Emprestimo>emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void cadastraLivro(Livro livros) {
        this.livros.add(livros);
    }

    public void cadastraUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    public void emprestarLivro(int id_livro, int id_usuario) {
        Livro livro = buscarIdLivro(id_livro);
        Usuario usuario = buscarIdUsuario(id_usuario);

        if(livro !=null && usuario != null && livro.estaDisponivel()){
            livro.setDisponivel(false);
            Emprestimo emprestimo = new Emprestimo(livro, usuario);
            emprestimos.add(emprestimo);
            usuario.addLivro(livro);
            System.out.println("Emprestimo Realizado");
        }else{
            System.out.println("Emprestimo não Realizado");
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
