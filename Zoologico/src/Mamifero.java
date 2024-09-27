public class Mamifero extends Animal{
    public Mamifero(int id, String nome, String especie, int idade, Habitat habitat) {
        super(id, nome, especie, idade, habitat);
    }
    public void amamentar(){
        System.out.println("Este animal é um mamifero, então precisa mamar");
    }
}
