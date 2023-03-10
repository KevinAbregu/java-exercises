package com.timbuchalka2;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getReserved() {
        return reserved;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0){
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0){
            this.quantityStock = newQuantity;
        }
    }

    public void checkoutStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0){
            this.quantityStock = newQuantity;
            this.reserved += quantity;
        }
    }

    public boolean setReserved(int reserved) {
        if(this.quantityInStock() >= reserved + this.getReserved()){
            this.reserved += reserved;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this){
            return true;
        }
        if(obj instanceof StockItem){
            String objName = ((StockItem) obj).getName();
            return this.getName().equals(objName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if(this == o){
            return 0;
        }
        if(o != null){
            return this.getName().compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ": price " + String.format("%.2f",this.price) + ". Reserved: " + this.reserved;
    }
}
