package com.example.intel2512_finalproject;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FileItemRW extends FileReadWrite {
    ArrayList<Item> itemlist;

    public FileItemRW(String filename) {
        super(filename);
    }

    void readItemList() {

        // Read the content from file
        try {
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(filename));

            // Using the readObject() method
            System.out.println((ArrayList<Item>) objStream.readObject());
            objStream.close();
        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    void addItem(Item item) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        pw.println(item);
        pw.close();
    }

    void updateItem(Item item) {
        String directory = System.getProperty("user.home");
        String absolutePath = directory + File.separator + this.filename;

        // Write the content in file
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {
            String fileContent = "This is a sample text.";
            bufferedWriter.write(fileContent);
        } catch (IOException e) {
            // Exception handling
        }
    }

    void deleteItem(Item item) {

    }

    ArrayList<Item> getItemList() {
        return this.itemlist;
    }

    void setItemList(ArrayList<Item> itemList) {
        this.itemlist = itemList;
    }

}