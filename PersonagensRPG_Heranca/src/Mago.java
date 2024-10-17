public class Mago extends Personagen{
    public Mago(String nome) {
        super(nome, 100, 200);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Sou um o Mago"+nome+" e conjuro com meu poder arcano -Meteoro Divino- ");
    }
}
