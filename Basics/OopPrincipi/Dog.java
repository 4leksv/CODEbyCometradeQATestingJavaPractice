package OopPrincipi;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches");
    }
}
