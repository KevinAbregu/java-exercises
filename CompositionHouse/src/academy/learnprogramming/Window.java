package academy.learnprogramming;

public class Window {
    private int amount;
    private int size;
    private String type;

    public Window(int amount, int size, String type) {
        this.amount = amount;
        this.size = size;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
