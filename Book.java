import java.util.Comparator;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String releaseDate;

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.releaseDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.title);
    }

    @Override
    public String toString() {
        return "Kitap Adı: " + title + ", Sayfa Sayısı: " + pageCount + ", Yazar: " + author + ", Yayın Tarihi: " + releaseDate;
    }
}

class PageCountComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getPageCount() - book2.getPageCount();
    }
}

class NameComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}