package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
