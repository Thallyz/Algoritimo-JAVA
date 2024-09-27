public class Animal {
    private int id;
    private String nome;
    private String especie;
    private int idade;
    private Habitat habitat;

    public Animal(int id, String nome, String especie, int idade, Habitat habitat) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void AnimalInformacoes(){
        System.out.println("id: "+id+", nome: "+nome+", especie: "+especie+", idade: "+idade+", habitat: "+habitat);
    }
}
