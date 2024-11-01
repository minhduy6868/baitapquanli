package OOPManager;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Go go go!");
    }

    @Override
    public String toString() {
        System.out.println("---------------------------------");
        return "Chó: " + getName() + ", Tuổi: " + getAge();
    }
}