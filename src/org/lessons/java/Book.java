package org.lessons.java;


public class Book {

    //ATTRIBUTI
    private String title;
    private int pages;
    private String author;
    private String editor;

    //COSTRUTTORI
    public Book(String title, int pages, String author, String editor) throws IllegalArgumentException {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("The title is missing");
        }
        else if (author == null || author.isBlank()){
            throw new IllegalArgumentException("The author is missing");
        }
        else if (editor == null ||editor.isBlank()){
            throw new IllegalArgumentException("The editor is missing");
        }
        else if(pages <= 0){
            throw new IllegalArgumentException("The number of pages cannot be 0");
        }
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.editor = editor;
    }

    //METODI - GET & SETTER

    //Titolo
    public String getTitle() {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("The title is missing");
        }
        return title;
    }
    public void setTitle(String title) {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("The title is missing");
        }
        this.title = title;
    }

    //Pagine
    public int getPages() {
        if(pages <= 0){
            throw new IllegalArgumentException("The number of pages cannot be 0");
        }
        this.pages = pages;
        return pages;
    }
    public void setPages(int pages) {
        if(pages <= 0){
            throw new IllegalArgumentException("The number of pages cannot be 0");
        }
        this.pages = pages;
    }

    //Autore
    public String getAuthor() {
        if (author == null || author.isBlank()){
            throw new IllegalArgumentException("The author is missing");
        }
        return author;
    }
    public void setAuthor(String author) {
        if (author == null || author.isBlank()){
            throw new IllegalArgumentException("The author is missing");
        }
        this.author = author;
    }

    //Editore
    public String getEditor() {
        if (editor == null ||editor.isBlank()){
            throw new IllegalArgumentException("The editor is missing");
        }
        return editor;
    }
    public void setEditor(String editor) {
        if (editor == null ||editor.isBlank()){
            throw new IllegalArgumentException("The editor is missing");
        }
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book {" +
            "Title = '" + title + '\'' +
            ", Number of pages = '" + pages + '\'' +
            ", Author = " + author +
            ", Editor = " + editor +
        '}';
    }
}
