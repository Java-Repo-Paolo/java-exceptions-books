package org.lessons.java;


public class Book {

    //ATTRIBUTI
    private String title;
    private int pages;
    private String author;
    private String editor;

    //COSTRUTTORI
    public Book(String title, int pages, String author, String editor) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.editor = editor;
    }

    //METODI - GET & SETTER

    //Titolo
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //Pagine
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    //Autore
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    //Editore
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
}
