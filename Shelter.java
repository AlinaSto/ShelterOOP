package ShelterOOP;

public class Shelter {
    private Animal[] animals; //{"Tom","Papucel"};
   private int numberOfAnimals = 0;

    public Shelter(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void makeNoise() {
        for (int i = 0; i <= numberOfAnimals; i++) {
            animals[i].makeSound();
        }
    }

    public boolean addAnimal(Animal addAnimal) {
        if (numberOfAnimals >= animals.length) {
            return false;
        }
        else {
            animals[numberOfAnimals]=addAnimal;
            numberOfAnimals++;
            return true;
        }
    }
}