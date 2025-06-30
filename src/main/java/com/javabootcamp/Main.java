package com.javabootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine vendingMachine = new Machine();
        boolean finished = false;

        Scanner sc = new Scanner(System.in);
        int choice = 0;

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
            String[] options = vendingMachine.getOptions();
            System.out.println("Please select the number of the item you would like to purchase: ");
            choice = sc.nextInt();

            vendingMachine.makeSelection(options[choice]);






            finished = true;
        }
    }

    
}