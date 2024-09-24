import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Curso> cursosMatriculados = new ArrayList<>();
    private List<Curso> cursosConcluidos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void matricularEmCurso(Curso curso) {
        cursosMatriculados.add(curso);
        System.out.println("Aluno " + nome + " matriculado no curso: " + curso.getNome());
    }

    public void completarCurso(Curso curso) {
        if (cursosMatriculados.contains(curso) && !cursosConcluidos.contains(curso)) {
            cursosConcluidos.add(curso);
            System.out.println("Curso " + curso.getNome() + " concluído por " + nome);
        }
    }

    public void visualizarProgresso() {
        System.out.println("\nProgresso de " + nome + ":");
        System.out.println("Cursos concluídos:");
        for (Curso curso : cursosConcluidos) {
            System.out.println("- " + curso.getNome() + " (" + curso.getCargaHoraria().toHours() + " horas)");
        }

        int horasCursadas = cursosConcluidos.stream()
                .mapToInt(curso -> (int) curso.getCargaHoraria().toHours())
                .sum();
        System.out.println("Total de horas cursadas: " + horasCursadas);
    }
}
