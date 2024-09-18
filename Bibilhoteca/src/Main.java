
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando a biblioteca
        Biblioteca biblioteca = getBiblioteca();

        // Menu para o sistema da biblioteca
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Biblioteca ---");
            System.out.println("1. Listar Livros");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Cadastrar Usuário");
            System.out.println("4. Realizar Empréstimo");
            System.out.println("5. Devolver Livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarLivros(biblioteca);
                    break;
                case 2:
                    cadastrarLivro(biblioteca, scanner);
                    break;
                case 3:
                    cadastrarUsuario(biblioteca, scanner);
                    break;
                case 4:
                    realizarEmprestimo(biblioteca, scanner);
                    break;
                case 5:
                    devolverLivro(biblioteca, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static Biblioteca getBiblioteca() {
        Biblioteca biblioteca = new Biblioteca();

        // Criando alguns livros
        Livro livro1 = new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro(2, "1984", "George Orwell");
        Livro livro3 = new Livro(3, "Dom Quixote", "Miguel de Cervantes");

        // Adicionando os livros à biblioteca
        biblioteca.cadastraLivro(livro1);
        biblioteca.cadastraLivro(livro2);
        biblioteca.cadastraLivro(livro3);

        // Criando alguns usuários
        Usuario usuario1 = new Usuario(1,"João");
        Usuario usuario2 = new Usuario(2,"Maria");

        // Adicionando os usuários à biblioteca
        biblioteca.cadastraUsuario(usuario1);
        biblioteca.cadastraUsuario(usuario2);
        return biblioteca;
    }

    // Função para listar os livros cadastrados
    private static void listarLivros(Biblioteca biblioteca) {
        System.out.println("\nLivros disponíveis:");
        for (Livro livro : biblioteca.getLivros()) {
            String status = livro.estaDisponivel() ? "Disponível" : "Indisponível";
            System.out.println("ID: " + livro.getId() + ", Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + " - " + status);
        }
    }

    // Função para cadastrar um novo livro
    private static void cadastrarLivro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("\nDigite o título do livro: ");
        scanner.nextLine();  // Consumir a quebra de linha
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        Livro novoLivro = new Livro(biblioteca.getLivros().size() + 1, titulo, autor);
        biblioteca.cadastraLivro(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    // Função para cadastrar um novo usuário
    private static void cadastrarUsuario(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("\nDigite o nome do usuário: ");
        scanner.nextLine();  // Consumir a quebra de linha
        String nome = scanner.nextLine();

        Usuario novoUsuario = new Usuario(biblioteca.getUsuarios().size() + 1, nome);
        biblioteca.cadastraUsuario(novoUsuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    // Função para realizar empréstimo
    private static void realizarEmprestimo(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("\nDigite o ID do livro para empréstimo: ");
        int livroId = scanner.nextInt();
        System.out.print("Digite o ID do usuário que fará o empréstimo: ");
        int usuarioId = scanner.nextInt();

        biblioteca.emprestarLivro(livroId, usuarioId);
    }

    // Função para devolver livro
    private static void devolverLivro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("\nDigite o ID do livro para devolução: ");
        int livroId = scanner.nextInt();
        System.out.print("Digite o ID do usuário que está devolvendo: ");
        int usuarioId = scanner.nextInt();

        biblioteca.devolverLivro(livroId, usuarioId);
    }
}