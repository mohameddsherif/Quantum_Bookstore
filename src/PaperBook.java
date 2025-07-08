public class PaperBook extends AbstractBook {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    public int getStock() { return stock; }

    public void reduceStock(int qty) {
        if (qty > stock) throw new IllegalArgumentException("Not enough stock.");
        stock -= qty;
    }
}
