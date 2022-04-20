package Lesson10;

public class Book {
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Author getAuthor() {
        return author;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    private String title;
    private int releaseYear;
    private Author author;


    Book (String title, Author author, int releaseYear) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
    }
    
}
