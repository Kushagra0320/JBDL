package OOPS;

public class Abstraction {
    public void DoNoise(Animal animal){
        animal.makesound();// this is an abstract method.

    }

    public static void main(String[] args) {
        // using Animal Class
        Abstraction main= new Abstraction();
        Animal animal= new Cat();
        main.DoNoise(animal);
    }
}
