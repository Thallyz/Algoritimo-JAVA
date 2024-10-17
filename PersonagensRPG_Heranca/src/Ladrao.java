public class Ladrao extends Personagen{
    public Ladrao(String nome) {
        super(nome, 150,150);
    }
    @Override
    public void habilidadeEspecial() {
        System.out.println("Sou o Ladino "+nome+" e estou -invisivel- ");
    }
}