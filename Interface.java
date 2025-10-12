interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in a kennel");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}