package org.lessons.java;

import java.io.FileWriter;
import java.io.IOException;


public class Library {
    public static void main(String[] args) throws IOException {
        FileWriter myWriter = new FileWriter("library.txt");
            myWriter.write("ciao");

        myWriter.close();
    }


}
