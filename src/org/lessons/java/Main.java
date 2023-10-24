package org.lessons.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many books do you want to add? ");
        int addBook = Integer.parseInt(scanner.nextLine());

        Book[] bookLibrary = new Book[addBook];

        for (int i = 0; i < bookLibrary.length; i++) {
            System.out.println("Insert book " + (i + 1));

            try {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Number of pages: ");
                String numberPages = scanner.nextLine();
                System.out.print("Author: ");
                String author = scanner.nextLine();
                System.out.print("Editor: ");
                String editor = scanner.nextLine();

                Book book = new Book(title, Integer.parseInt(numberPages), author, editor);
                bookLibrary[i] = book;
            }catch (IllegalArgumentException e){
                System.out.println("Invalid error: " + e.getMessage());
                System.out.println();
                i--;
                continue;
            }

        }



        for (Book totalBooks : bookLibrary) {
            System.out.println(totalBooks);
        }

        try{
            FileWriter myWriter = new FileWriter("library.txt");
            // Scrivi ciascun libro nel file
            for (Book book : bookLibrary) {
                myWriter.write("Book: " + "\n");
                myWriter.write("Titolo: " + book.getTitle() + "\n");
                myWriter.write("Pagine: " + book.getPages() + "\n");
                myWriter.write("Autore: " + book.getAuthor() + "\n");
                myWriter.write("Editore: " + book.getEditor() + "\n");
                myWriter.write("\n");
            }
            myWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }



        scanner.close();


    }
}
