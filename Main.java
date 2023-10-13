import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Book> booksByName = new TreeSet<>();
        booksByName.add(new Book("A BOOK 1", 10, "Ali", "2005-06-15"));
        booksByName.add(new Book("BOOK 5", 75, "Veli", "2013-04-18"));
        booksByName.add(new Book("C BOOK 3", 25, "Zeki", "2010-02-11"));
        booksByName.add(new Book("BOOK 2", 33, "Sabri", "2018-03-20"));
        booksByName.add(new Book("D BOOK 4", 21, "Avni", "2017-11-20"));

        System.out.println("Kitaplar İsim Sırasına Göre:");

        System.out.println();

        for (Book book : booksByName) {
            System.out.println(book);
        }


        Set<Book> booksByPageCount = new TreeSet<>(new PageCountComparator());
        booksByPageCount.add(new Book("A BOOK 1", 10, "Ali", "2005-06-15"));
        booksByPageCount.add(new Book("BOOK 5", 75, "Veli", "2013-04-18"));
        booksByPageCount.add(new Book("C BOOK 3", 25, "Zeki", "2010-02-11"));
        booksByPageCount.add(new Book("BOOK 2", 33, "Sabri", "2018-03-20"));
        booksByPageCount.add(new Book("D BOOK 4", 21, "Avni", "2017-11-20"));


        System.out.println("\nKitaplar Sayfa Sayısına Göre:");

        System.out.println();

        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}