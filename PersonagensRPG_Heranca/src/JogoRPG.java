import java.util.Scanner;

public class JogoRPG{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nome seu personagem: ");
        String nome =scanner.nextLine();

        int escolha=0;
        Personagen personagen = null;
        while(true){
        System.out.println("Qual a sua Classe:");
        System.out.println("1. Mago");
        System.out.println("2. Guerreiro");
        System.out.println("3. Sacerdote");
        System.out.println("4. Ladrao:");

        if (scanner.hasNextInt()) {
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    personagen = new Mago(nome);
                    break;
                case 2:
                    personagen = new Guerreiro(nome);
                    break;
                case 3:
                    personagen = new Sacerdote(nome);
                    break;
                case 4:
                    personagen = new Ladrao(nome);
                    break;
                default:
                    System.out.println("Opção invalida");
                    continue;
            }
            personagen.status();
            personagen.habilidadeEspecial();
            scanner.close();
        }
        break;
    }
}}