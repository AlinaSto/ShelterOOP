package ShelterOOP;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pisu", 1);
        Dog dog = new Dog("Papucel", 5);
        Animal[] animals = new Animal[10];
        Shelter shelter = new Shelter(animals);
        shelter.addAnimal(cat);
        shelter.addAnimal(dog);
        shelter.makeNoise();

    }
}
