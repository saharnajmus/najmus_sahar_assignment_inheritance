package be.intecbrussel.animals;

public class Bird extends Animal {
    public Bird() {
        this(null);
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Birds fly");
    }

    @Override
    public void makeNoise() {
        System.out.println("The bird says tweet tweet");
    }
}
