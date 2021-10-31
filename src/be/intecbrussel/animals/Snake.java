package be.intecbrussel.animals;

public class Snake extends Animal {
    public Snake() {
        this(null);
    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Snakes crawl");
    }

    @Override
    public void makeNoise() {
        System.out.println("The snake says hiss hiss");
    }
}
