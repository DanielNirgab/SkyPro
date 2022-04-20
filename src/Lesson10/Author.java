package Lesson10;

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
}