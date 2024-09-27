import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico(){
        this.animais=new ArrayList<>();
    }

    //metodo para cadastra
    public void cadatrarAnimal(Animal animal){
        animais.add(animal);
        System.out.println("Foi Cadastrado com Sucesso");
    }
    //metodo para listar os animais por habitat
    public void AnimaisHabitats(Habitat habitat){
        System.out.println("Animais por habitats"+habitat+" : ");
        for(Animal animal: animais){
            if(animal.getHabitat() == habitat){
                animal.AnimalInformacoes();
            }
        }
    }
}
