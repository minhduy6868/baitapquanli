package OOPManager;

import java.util.ArrayList;

public class AnimalManager {
    private ArrayList<Animal> animals;

    public AnimalManager() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    public void removeAnimalByName(String name) {
        animals.removeIf(animal -> animal.getName().equalsIgnoreCase(name));  //vòng lặp nâng cao
    }

    public void sound(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.makeSound();
            }
        }
    }
}
