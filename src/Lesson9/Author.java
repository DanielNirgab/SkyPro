package Lesson9;

import java.util.Objects;

public class Author {

    private String name;
    private String secondName;

    Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }
    @Override
    public String toString() {
        return "Автор: " + name + " " + secondName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return name.equals(author.name) && secondName.equals(author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}