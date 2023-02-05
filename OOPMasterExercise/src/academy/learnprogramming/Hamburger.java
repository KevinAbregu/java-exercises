package academy.learnprogramming;

public class Hamburger {
    private double price;
    private String name, meat, breadRollType;

    private double addition1Price, addition2Price, addition3Price, addition4Price;
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;

        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " +
                this.meat + ", price is " + this.price);
    }
    public void addHamburgerAddition1(String name, double price){

        System.out.println("Added " + name + " for an extra " + price);
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){

        System.out.println("Added " + name + " for an extra " + price);
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){

        System.out.println("Added " + name + " for an extra " + price);
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){

        System.out.println("Added " + name + " for an extra " + price);
        this.addition4Name = name;
        this.addition4Price = price;
    }
    public double itemizeHamburger(){
        double totalPrice = price;
        totalPrice += addition1Price + addition2Price + addition3Price + addition4Price;
        return totalPrice;
    }

}
