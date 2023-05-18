package OopPrincipi;

public class Zoo {
    public static void main(String[] args) {
        Dog esta = new Dog();
        esta.speak();

        Animal bingo = new Dog();
        ((Dog)bingo).fetch();

//       Animal kitty = new Cat();

          feed(bingo);
//        feed(kitty);
    }

    public static  void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Feed the dog");
        } else if (animal instanceof Cat) {
            System.out.println("Feed the cat");
        }
    }
}
