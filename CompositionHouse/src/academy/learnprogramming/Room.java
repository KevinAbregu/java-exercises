package academy.learnprogramming;

public class Room {
    private String name;
    private Walls wall1;
    private Walls wall2;
    private Walls wall3;
    private Walls wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Room(String name, Walls wall1, Walls wall2, Walls wall3, Walls wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public void makeBed(){
        System.out.println("Room -> Making bed");
        bed.make();
    }

    public Lamp getLamp() {
        return lamp;
    }
}
