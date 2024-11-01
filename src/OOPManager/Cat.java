package OOPManager;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        System.out.println("---------------------------------");
        return "Mèo: " + getName() + ", tuổi: " + getAge();
    }
}