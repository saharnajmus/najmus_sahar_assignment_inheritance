package be.intecbrussel.animals;

public abstract class Animal {
    private String name;

    public Animal() {
        this(null);
    }

    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract void makeNoise();
}
