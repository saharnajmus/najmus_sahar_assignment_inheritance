package be.intecbrussel.animals;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat("puss");
        Animal fish = new Fish("Nemo");
        Animal bird = new Bird("sparrow");
        Animal snake = new Snake("cobra");
        cat.move();
        cat.makeNoise();
        fish.move();
        fish.makeNoise();
        bird.move();
        bird.makeNoise();
        snake.move();
        snake.makeNoise();


    }
}
