package ObjectsAndClasses;

import java.util.Arrays;

public class Article {
    private String title;
    private String content;
    private String author;


    public String getTitle() {
        return this.title;
    }
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public  void rename (String newTitle) {
        this.title = newTitle;
    }
    @Override public String toString() {
        return String.format("%s - %s: %s", title, content, author);
    }
}
