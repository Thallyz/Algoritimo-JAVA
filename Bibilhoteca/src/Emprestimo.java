import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dateEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dateEmprestimo = dateEmprestimo.now();
        this.dataDevolucao = dataDevolucao.plusDays(7);
    }
    

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDateEmprestimo() {
        return dateEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}
