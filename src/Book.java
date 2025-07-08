public interface Book {
    String getISBN();
    String getTitle();
    int getYear();
    double getPrice();
    String getAuthor();
    boolean isOutdated(int currentYear, int maxAge);
}
