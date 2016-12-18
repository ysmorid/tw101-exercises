package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.lang.*;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        printStream.println("Searching database for books containing the word '" + partialBookTitle + "' in title.");
        printStream.println("Search Results:");
        for(int i = 0; i <books.length; i++){
            boolean match = books[i].contains(partialBookTitle);
            if(match){
                printStream.println(books[i]);
            }
        }

    }
}
