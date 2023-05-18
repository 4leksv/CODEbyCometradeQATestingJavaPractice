package Zadatak;

public class Duck extends Animal{

    @Override
    public void eat() {
        System.out.println("Duck eats bread");
    }

    @Override
    String makeSound() {
        return null;
    }
}
