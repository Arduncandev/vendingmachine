package com.javabootcamp;

public class Item {
    private String name;
    private double price;
    private int amount = 1;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void incAmount(){
        this.amount += 1;
    }

    public void decAmount(){
        this.amount -= 1;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
