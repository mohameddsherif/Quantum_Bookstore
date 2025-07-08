public class EBook extends AbstractBook {
    private final String filetype;

    public EBook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }

    public String getFiletype() {
        return filetype;
    }
}
