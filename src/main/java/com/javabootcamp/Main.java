package com.javabootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine vendingMachine = new Machine();
        boolean finished = false;

        Scanner sc = new Scanner(System.in);
        int choice = 99;

        vendingMachine.addItem("Coca-cola", 1.5);
        vendingMachine.addItem("Coca-cola", 1.5);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);

        do{

            vendingMachine.printStock();
            String[] options = vendingMachine.getOptions();
            System.out.println("Please select the number of the item you would like to purchase: ");
            System.out.println("To finalize purchase, please press 0.");
            choice = sc.nextInt();

            vendingMachine.makeSelection(options[choice]);

            vendingMachine.listSelections();




            finished = true;
        }while (choice != 0);
    } 

    
}