public abstract class Personagen {
    protected String nome;
    protected int vida;
    protected int alma;

    public Personagen(String nome, int vida, int alma) {
        this.nome = nome;
        this.vida = vida;
        this.alma = alma;
    }

    public void status() {
        System.out.println(nome+" HP: "+vida+" SP: "+alma);
    }

    public abstract void habilidadeEspecial();
}
