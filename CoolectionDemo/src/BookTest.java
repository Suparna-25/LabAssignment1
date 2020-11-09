import java.util.List;

public class BookTest {
	public static void main(String[] args) {
		Book[] book = { new Book("101", "The Leader Who had No Title", "RobinSharma"),
				new Book("102", "Object Oriented Programming", "Balaguruswami"),
				new Book("103", "Head First Java", "Siere & Bates"),
				new Book("101", "The Leader Who had No Title", "RobinSharma"),
				new Book("102", "Object Oriented Programming", "Balaguruswami") };
		BookService bookService = new BookService();
		if (book[0].equals(book[3])) {
			System.out.println("Equal");
		}
		System.out.println("Hascode of" + book[0].getId() + ":" + book[0].hashCode());
		System.out.println("Hascode of" + book[3].getId() + ":" + book[3].hashCode());

		List<Book> duplicateBooks = bookService.findDuplicateBooks(book);
		System.out.println(duplicateBooks);
		System.out.println("Total duplicate book" + duplicateBooks.size());

	}
}
