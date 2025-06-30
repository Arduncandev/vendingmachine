package com.javabootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine vendingMachine = new Machine();
        addDummyData(vendingMachine);

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do{

            vendingMachine.printStock();
            String[] options = vendingMachine.getOptions();

            vendingMachine.listSelections();
            System.out.println("Please select the number of the item you would like to purchase: ");
            System.out.println("To finalize purchase, please press 0.");

            choice = sc.nextInt();

            if(choice > options.length || choice < 0){
                System.out.println("Invalid choice, please try again.");
            } else {
                 vendingMachine.makeSelection(options[choice - 1]);   
            }


            
        }while (choice != 0);


    } 

    public static void addDummyData(Machine vendingMachine){
        vendingMachine.addItem("Coca-cola", 1.5);
        vendingMachine.addItem("Coca-cola", 1.5);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);
        vendingMachine.addItem("Dr. Pepper", 1.0);
        vendingMachine.addItem("Mr. Pibb", 1.25);
    }
}