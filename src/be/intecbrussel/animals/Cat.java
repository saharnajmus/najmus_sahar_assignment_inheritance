package be.intecbrussel.animals;

public class Cat extends Animal {
    public Cat() {
        this(null);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Cats walk");
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat says meow meow");
    }
}
