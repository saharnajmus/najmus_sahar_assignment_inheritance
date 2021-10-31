package be.intecbrussel.animals;

public class Fish extends Animal {
    public Fish() {
        this(null);
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Fish swim");
    }

    @Override
    public void makeNoise() {
        System.out.println("The fish says swoosh swoosh");
    }
}
