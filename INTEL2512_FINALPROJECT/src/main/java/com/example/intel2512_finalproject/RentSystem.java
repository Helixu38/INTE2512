package com.example.intel2512_finalproject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class RentSystem {

    private ArrayList<Account> accountList;
    private ArrayList<Item> itemList;
    private String filename;

    public RentSystem() {
        
        accountList = new ArrayList<>();
        itemList = new ArrayList<>();
        itemList.add(new Item("I001-2001", "Medal of Honour", "Game", "1-week",3,3.99,"\t", false));
        itemList.add(new Item("I002-1988", "White Castle", "Record", "1-week",3,0.99,"Comedy",false));
        filename = "database.txt";

        // "I003-1992,Alpha Dog,Record,1-week,3,1.99,Action",
        // "I004-1999,Rat Race,DVD,1-week,3,1.99,Horror",
        // "I005-2015,Halo,Game,2-day,2,4.99",
        // "I006-2013,Halloween,DVD,2-day,1,0.99,Horror"));
        

    }

//    void rent(Item requestedItem, Account user) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
//        String line;
//        // for (Item item: itemList) {
//        while((line = reader.readLine()) != null){
//            Item requestedItem = lineToItem(line);
//            if (requestedItem.id == item.id) {
//                if (item.getNumberCopies > 0) {
//                    item.borrowed();
//                }
//                break;
//            }
//        }
//        reader.close();
//
//        // Write new rented entry into account database
//    }
    

//    Item lineToItem(String line) {
//        // BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
//        // String line;
//        // while((line = reader.readLine()) != null){
//        String[] newItem = line.split(",", 0);
//        Item current = new Item(newItem[0])
//        // reader.close();
//    }

    void promote(Account user) {
        // Check returned count after user makes a return, read the account database and find the old entry, erase it and replace with
        // new entry of the promoted user, no fields need to change aside from the customerType
    }

    

    void displayItem(){
        Collections.sort(itemList, new Comparator<Item>() {
            public int compare(Item a, Item b)
    {
 
        return a.getId().compareTo(b.getId());
    }
        });
        for (Item itx: itemList) {
            // ArrayList<String>sorteditx = itx.stream()sorted(Comparator.naturalOrder());
            System.out.println(itx.toString());
        }
    }  

    void displayOutofstock(){
        for (Item itx: itemList) {
            if(itx.getNumberCopies() == 0){
                System.out.println(itx);
            }
            

        }
    }


    

}
