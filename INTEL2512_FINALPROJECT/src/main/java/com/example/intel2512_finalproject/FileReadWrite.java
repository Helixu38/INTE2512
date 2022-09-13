package com.example.intel2512_finalproject;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReadWrite {

    String filename;

    Scanner inp;


    public FileReadWrite(String filename) {

        String rel_path = "INTEL2512_FINALPROJECT/src/main/java/com/example/intel2512_finalproject/";
        this.filename = rel_path + filename;

        this.inp = new Scanner(this.filename);
    }

    void setInfo() {
    }

    void readInfo() {

    }

    void writeInfo() {

    }

}
