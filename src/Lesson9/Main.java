package Lesson9;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Эдуард", "Невзоров");
        Author author2 = new Author("Федот", "Жерн");

        Book book1 = new Book("Небесная проза", author1, 2015);
        Book book2 = new Book("Летун", author2, 2022);
        Book book3 = new Book("Летун", author2, 2022);
        Book book4 = new Book("Летун", author2, 2023);

        book1.setReleaseYear(2019);

        System.out.println(book2.getAuthor().getName() + " "+book2.getAuthor().getSecondName());
        System.out.println(book2.getTitle() + " " + book2.getReleaseYear());

        System.out.println(book2);
        System.out.println(book1);
        System.out.println(author1);
        System.out.println(author2);

        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book2.equals(book4));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
    }
}
