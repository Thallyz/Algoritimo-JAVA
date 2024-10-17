public class Sacerdote extends Personagen{
    public Sacerdote(String nome) {
        super(nome, 120,180);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Sou o Sacerdote"+nome+" com meu -poder divino- eu curo todos do meu grupo ");
    }
}
