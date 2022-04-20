package Lesson10;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Эдуард", "Невзоров");
        Author author2 = new Author("Федот", "Жерн");

        Book book1 = new Book("Небесная проза", author1, 2015);
        Book book2 = new Book("Летун", author2, 2022);

        book1.setReleaseYear(2019);

        System.out.println(book2.getAuthor().getName() + " "+book2.getAuthor().getSecondName());
        System.out.println(book2.getTitle() + " " + book2.getReleaseYear());

    }
}
