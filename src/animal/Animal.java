package animal;

/*Creează o clasă Animal cu atribute: nume (String) și sunet (String).
Creează o metodă care afișează sunetul făcut de animal într-un format precum: „[nume] face [sunet]”. */

public class Animal {
    String animal;
    String sound;
    public Animal(String animal, String sound) {
        this.animal = animal;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(animal + " face " + sound);
    }

}
