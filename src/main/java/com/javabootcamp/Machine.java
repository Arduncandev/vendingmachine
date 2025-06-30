package com.javabootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
    Map<String, Item> inventory = new HashMap<>();
    List<Item> currentSelections = new ArrayList<>();


    public void addItem(String name, double price) {
        if(inventory.containsKey(name)){
            inventory.get(name).incAmount();
        } else {
            inventory.put(name, new Item(name, price));
        }
    }

    public void removeItem(String name){

        if(!inventory.containsKey(name)){
            System.out.println("Item not found");
        } else if(inventory.get(name).getAmount() <= 0){
            System.out.println("Sorry...out of stock");
        } else {
            inventory.get(name).decAmount();
        }

        if(inventory.get(name).getAmount() == 0){
            inventory.remove(name);
        }
    }

    public void printStock(){
        int count = 1;
        if(inventory.isEmpty()){
            System.out.println("Vending Machine Completely Out of Stock");
            return;
        }
        for (Map.Entry<String, Item> entry : inventory.entrySet()) {
            System.out.println(count + ". " + entry.getKey() + " Price: $" + entry.getValue().getPrice() + " Stock: " + entry.getValue().getAmount());
            count++;
            
        }
    }

    public void listSelections() {
        if(currentSelections.size() == 0){
            return;
        }

        System.out.println("Current Selections:");
        for(int i = 0; i < currentSelections.size(); i++) {
            Item selection = currentSelections.get(i);
            System.out.println((i+1) + ". " + selection.getName() + " Price: $" + selection.getPrice());
        }
        System.out.println("Total Price: $" + getTotalPrice());
    }

    public void makeSelection(String name){

        currentSelections.add(inventory.get(name));
        removeItem(name);
    }

    public String[] getOptions() {
        String[] options = new String[inventory.size()];
        
        int index = 0;
        for (Map.Entry<String, Item> entry : inventory.entrySet()) {
            options[index] = entry.getKey();
            index++;
            
        }
        return options;
    }

    public double getTotalPrice() {
        double total = 0;
        for(Item select : currentSelections) {
            total += select.getPrice();
        }
        return total;
    }
}
