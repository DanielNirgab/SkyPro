package Lesson9;

import java.util.Objects;

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
    @Override
    public String toString() {
        return author.toString() + "; Название: " + title + "; Год издания: " + releaseYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        if (releaseYear != book1.releaseYear) {
            return false;
        }
        return author.equals(book1.author) && title.equals(book1.title);
        }
        @Override
    public int hashCode() {
        return Objects.hash(author, title, releaseYear);
        }
}
