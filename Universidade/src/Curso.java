import java.time.Duration;
//a
public class Curso {
    private String nome;
    private Professor professor;
    private Duration cargaHoraria;

    public Curso(String nome, Professor professor, Duration cargaHoraria) {
        this.nome = nome;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public Duration getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibirDetalhes() {
        System.out.println("\nCurso: " + nome);
        professor.exibirInformacoes();
        System.out.println("Carga Horária: " + cargaHoraria.toHours() + " horas");
    }
}
