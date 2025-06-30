package com.javabootcamp;

public class Main {
    public static void main(String[] args) {
        Machine vendingMachine = new Machine();
        boolean finished = false;

        vendingMachine.addItem("Coca-cola", 1.5);
        vendingMachine.addItem("Coca-cola", 1.5);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);

        while (finished != true) {

            vendingMachine.printStock();
            finished = true;
        }
    }
}