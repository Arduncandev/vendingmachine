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
    }

    public void printStock(){
        int count = 1;
        for (Map.Entry<String, Item> entry : inventory.entrySet()) {

            System.out.println(count + ". " + entry.getKey() + " Price: $" + entry.getValue().getPrice() + " Stock: " + entry.getValue().getAmount());
            count++;
            
        }
    }

    public void makeSelection(String name){
        inventory.get(name).decAmount();
        currentSelections.add(inventory.get(name));
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
}
