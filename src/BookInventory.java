import java.util.*;

public class BookInventory {
    private final Map<String, Book> books = new HashMap<>();

    public void add(Book book) {
        books.put(book.getISBN(), book);
        System.out.println("Quantum book store: Added " + book.getTitle());
    }

    public List<Book>removeOutdated(int currentYear, int maxAge) {
        List<Book> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iter = books.entrySet().iterator();

        while (iter.hasNext()) {
            Book b = iter.next().getValue();
            if (b.isOutdated(currentYear, maxAge)) {
                iter.remove();
                removed.add(b);
                System.out.println("Quantum book store: Removed outdated book: " + b.getTitle());
            }
        }
        return removed;
    }

    public double buy(String isbn, int quantity, String email, String address) {
        Book book = books.get(isbn);
        if (book == null)
            throw new IllegalArgumentException("Book not found.");
        if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            pb.reduceStock(quantity);
            System.out.println("Quantum book store: Shipping paper book to"+address);
            return pb.getPrice() * quantity;
        } else if (book instanceof EBook) {
            System.out.println("Quantum book store: Sending eBook to "+email);
            return book.getPrice();
        } else if (book instanceof DemoBook) {
            throw new UnsupportedOperationException("Demo book is not for sale.");
        } else {
            throw new IllegalStateException("Unknown book type.");
        }
    }
}
