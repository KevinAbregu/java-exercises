package academy.learnprogramming;

public class Motherboard {
    private String model;
    private String manufacter;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacter, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacter = manufacter;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading..");
    }

    public String getModel() {
        return model;
    }

    public String getManufacter() {
        return manufacter;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
