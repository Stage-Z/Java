abstract class Objects {
    // abstract method declaration
    abstract void showShape();

    public void shape() {
        System.out.println("I'm from abstract class");
    }
}

class Sphere extends Objects {
    /**
     * This is indirectly an overridden showShape method by making use of the abstract class
     */
    @Override
    void showShape() {
        System.out.println("Object type is Sphere.");
    }
}

class Cuboid extends Objects {
    /**
     * This is indirectly an overridden showShape method by making use of the abstract class
     */
    @Override
    void showShape() {
        System.out.println("Object type is Cuboid.");
    }
}

class Prism extends Objects {
    /**
     * This is indirectly an overridden showShape method by making use of the abstract class
     */
    @Override
    void showShape() {
        System.out.println("Object type is Prism.");
    }
}

public class ObjectsPolymorphism {
    public static void main(String args[]) {
        Objects obj = new Sphere();
        obj.showShape();
        obj = new Cuboid();
        obj.showShape();
        obj = new Prism();
        obj.showShape();
        obj.shape();
    }
}