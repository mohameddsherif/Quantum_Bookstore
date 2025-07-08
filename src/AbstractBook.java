public abstract class AbstractBook implements Book {
    protected final String isbn, title, author;
    protected final int year;
    protected final double price;

    public AbstractBook(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    @Override public String getISBN()   { return isbn; }
    @Override public String getTitle()  { return title; }
    @Override public int getYear()      { return year; }
    @Override public double getPrice()  { return price; }
    @Override public String getAuthor() { return author; }

    @Override
    public boolean isOutdated(int currentYear, int maxAge) {
        return currentYear - year > maxAge;
    }
}
