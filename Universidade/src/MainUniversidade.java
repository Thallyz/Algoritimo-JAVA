import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainUniversidade {
    private List<Curso> cursos = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainUniversidade sistema = new MainUniversidade();
        sistema.iniciarSistema();
    }

    public void iniciarSistema() {
        criarProfessoresECursos();
        criarAlunosFixos();

        boolean continuar = true;
        while (continuar) {
            continuar = exibirMenu();
        }
    }

    // Método para criar professores e cursos
    private void criarProfessoresECursos() {
        Professor profJoao = new Professor("João", "Doutor", 15);
        Professor profMaria = new Professor("Maria", "Mestre", 10);

        Curso cursoSI = new Curso("Sistemas de Informação", profJoao, Duration.ofHours(3000));
        Curso cursoRedes = new Curso("Redes de Computadores", profMaria, Duration.ofHours(1500));

        cursos.add(cursoSI);
        cursos.add(cursoRedes);

        System.out.println("Cursos criados automaticamente.");
    }

    // Método para criar dois alunos fixos para testes
    private void criarAlunosFixos() {
        Aluno alunoCarlos = new Aluno("Carlos");
        Aluno alunoAna = new Aluno("Ana");
        alunos.add(alunoCarlos);
        alunos.add(alunoAna);

        System.out.println("Alunos fixos criados: Carlos e Ana.");
    }

    // Método para exibir o menu e executar as operações com switch-case
    private boolean exibirMenu() {
        System.out.println("\nMenu de Operações:");
        System.out.println("1. Matricular Aluno em Curso");
        System.out.println("2. Completar Curso");
        System.out.println("3. Visualizar Progresso do Aluno");
        System.out.println("4. Exibir Detalhes dos Cursos");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");

        int escolha = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        switch (escolha) {
            case 1:
                matricularAluno();
                break;
            case 2:
                completarCurso();
                break;
            case 3:
                visualizarProgresso();
                break;
            case 4:
                exibirDetalhesCursos();
                break;
            case 5:
                System.out.println("Saindo do sistema...");
                return false;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        return true;
    }

    // Método para matricula
    private void matricularAluno() {
        Aluno aluno = selecionarAluno();
        if (aluno != null) {
            exibirCursosDisponiveis();
            System.out.println("Digite o número do curso que deseja matricular ou 3 para cancelar:");
            int escolhaCurso = scanner.nextInt();
            if (escolhaCurso >= 1 && escolhaCurso <= cursos.size()) {
                aluno.matricularEmCurso(cursos.get(escolhaCurso - 1));
            } else if (escolhaCurso == 3) {
                System.out.println("Operação cancelada.");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    // Método para completar um curso
    private void completarCurso() {
        Aluno aluno = selecionarAluno();
        if (aluno != null) {
            exibirCursosDisponiveis();
            System.out.println("Digite o número do curso que o aluno completou ou 3 para cancelar:");
            int escolhaCurso = scanner.nextInt();
            if (escolhaCurso >= 1 && escolhaCurso <= cursos.size()) {
                aluno.completarCurso(cursos.get(escolhaCurso - 1));
            } else if (escolhaCurso == 3) {
                System.out.println("Operação cancelada.");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    // Método para visualizar o progresso do aluno
    private void visualizarProgresso() {
        Aluno aluno = selecionarAluno();
        if (aluno != null) {
            aluno.visualizarProgresso();
        }
    }

    // Método para exibir detalhes dos cursos
    private void exibirDetalhesCursos() {
        for (Curso curso : cursos) {
            curso.exibirDetalhes();
        }
    }

    // Método para exibir os cursos disponíveis
    private void exibirCursosDisponiveis() {
        System.out.println("\nCursos disponíveis:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + ". " + cursos.get(i).getNome() + " (" + cursos.get(i).getCargaHoraria().toHours() + " horas)");
        }
        System.out.println("3. Cancelar");
    }

    // Método para selecionar um aluno a partir da lista
    private Aluno selecionarAluno() {
        System.out.println("\nAlunos disponíveis:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + ". " + alunos.get(i).getNome());
        }
        System.out.print("Digite o número do aluno ou 3 para cancelar: ");
        int escolhaAluno = scanner.nextInt();
        if (escolhaAluno >= 1 && escolhaAluno <= alunos.size()) {
            return alunos.get(escolhaAluno - 1);
        } else if (escolhaAluno == 3) {
            System.out.println("Operação cancelada.");
            return null;
        } else {
            System.out.println("Opção inválida.");
            return null;
        }
    }
}
