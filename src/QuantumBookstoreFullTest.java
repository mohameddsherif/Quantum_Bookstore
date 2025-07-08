public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        BookInventory inventory = new BookInventory();

        PaperBook paperBook = new PaperBook("ISBN123", "Atomic Habits", 2018, 200, "James Clear", 5);
        EBook eBook = new EBook("ISBN456", "the 48 laws of Power", 2021, 150, "Robert Greene ", "PDF");
        DemoBook demoBook = new DemoBook("ISBN789", "Showcase Only", 2020, 0, "Anonymous");

        inventory.add(paperBook);
        inventory.add(eBook);
        inventory.add(demoBook);

        inventory.removeOutdated(2025, 5);

        try {
            double paid = inventory.buy("ISBN123", 2, "mohamed@mail.com", "Cairo, Egypt");
            System.out.println("Quantum book store: Paid amount: "+paid);
        } catch (Exception e) {
            System.out.println("Quantum book store: "+e.getMessage());
        }

        try {
            double paid = inventory.buy("ISBN456", 1, "mohamed@mail.com", null);
            System.out.println("Quantum book store: Paid amount: " + paid);
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }

        try {
            inventory.buy("ISBN789", 1, "mohamed@mail.com", null);
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
    }
}
