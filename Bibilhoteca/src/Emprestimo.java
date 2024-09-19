
import java.time.LocalDate;

public class Emprestimo {
    private final Livro livro;
    private final Usuario usuario;
    private LocalDate dateEmprestimo;
    private LocalDate dataDevolucao;
    private static final int devolucao=7;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dateEmprestimo =LocalDate.now();
        this.dataDevolucao = this.dateEmprestimo.plusDays(devolucao);
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
