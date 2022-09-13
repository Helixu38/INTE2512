package com.example.intel2512_finalproject;

import java.io.*;
import java.util.ArrayList;

public class FileAccRW extends FileReadWrite {
    ArrayList<Account> accountList;

    public FileAccRW(String filename) {
        super(filename);
    }

    void readAccList() {

        // Read the content from file
        try {
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(filename));

            // Using the readObject() method
            System.out.println((ArrayList<Account>) objStream.readObject());
            objStream.close();
        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    void addNewAcc(Account acc) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        pw.println(acc);
        pw.close();
    }

    void updateAcc(Account acc) {
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

    ArrayList<Account> getAccountList() {
        return this.accountList;
    }

    void setAccountList(ArrayList<Account> accList) {
        this.accountList = accList;
    }
  }