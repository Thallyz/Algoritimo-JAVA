public class Guerreiro extends Personagen{
    public Guerreiro(String nome) {
        super(nome, 200,100);
    }
    @Override
    public void habilidadeEspecial() {
        System.out.println("Sou um Guerreiro "+nome+" não preciso de poderzinho, com minha -armdura pesada- nada pode me ferrir ");
    }
}