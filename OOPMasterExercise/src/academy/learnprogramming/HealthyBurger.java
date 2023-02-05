package academy.learnprogramming;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy",meat ,price , "Brown rye");
    }
    public void addHealthyAddition1(String name, double price){

        System.out.println("Added " + name + " for an extra " + price);
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){

        System.out.println("Added " + name + " for an extra " + price);
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        totalPrice += healthyExtra1Price + healthyExtra2Price;
        return totalPrice;
    }
}
