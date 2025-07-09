# Quantum Bookstore

Quantum Bookstore is a simple, extensible Java application simulating an online bookstore system.  
It was developed as part of the Fawry Quantum Internship challenge.

## Features

- Add books to the inventory with the following attributes:
  - ISBN
  - Title
  - Author
  - Year of publication
  - Price
- Supports three types of books:
  - PaperBook – has quantity in stock and is shipped to an address
  - EBook – has a filetype and is sent via email
  - DemoBook – for showcase only and not available for sale
- Remove outdated books that exceed a specified age
- Buy a book using its ISBN, email, and shipping address
  - For PaperBooks:
    - Reduces quantity in stock
    - Throws an error if not available
    - Sends the book to the ShippingService (simulated)
  - For EBooks:
    - Sends the book to the MailService (simulated)
  - For DemoBooks:
    - Purchase is blocked with an error
- All console output is prefixed with: `Quantum book store:`

## Class Structure

- `Book` (interface): common methods for all book types
- `AbstractBook`: base class implementing `Book`
- `PaperBook`, `EBook`, `DemoBook`: specialized subclasses
- `BookInventory`: manages inventory, purchasing, and book removal
- `QuantumBookstoreFullTest`: contains the `main()` method to demonstrate and test functionality


## How to Run

1. Open the project in IntelliJ IDEA.
2. Place all `.java` source files inside the `src/` directory.
3. Run the `QuantumBookstoreFullTest` class (contains the `main()` method).
4. Review the output in the console.

## Author

- Name: Mohamed Sherif  
- Email: mo.abdallah.morsy@gmail.com  
- Location: Egypt

