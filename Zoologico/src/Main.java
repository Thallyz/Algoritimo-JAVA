public  class Main {
    public static void main(String[] args){
        Zoologico zoologico= new Zoologico();

        zoologico.cadatrarAnimal(new Mamifero(1,"TIGRE","BENGALA",5,Habitat.Terrestre));
        zoologico.cadatrarAnimal(new Animal(2,"Golfinho","Beluga",7,Habitat.Aquatico));
        zoologico.cadatrarAnimal(new Mamifero(3,"Aguia","Careca",1,Habitat.Aereo));

        zoologico.AnimaisHabitats(Habitat.Terrestre);
        zoologico.AnimaisHabitats(Habitat.Aereo);
        zoologico.AnimaisHabitats(Habitat.Aquatico);

    }
}