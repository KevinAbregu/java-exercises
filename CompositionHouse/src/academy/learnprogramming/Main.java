package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Walls wall1 = new Walls("West");
        Walls wall2= new Walls("East");
        Walls wall3 = new Walls("South");
        Walls wall4 = new Walls("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",false,75);

        Room room = new Room("Tims",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        room.makeBed();
        room.getLamp().turnOn();
    }
}
