import java.util.ArrayList;
import java.util.List;

public class BookService {

	public List<Book> findDuplicateBooks(Book[] books) {
		List<Book> duplicateBooks = new ArrayList<>();
		for (int i = 0; i < books.length; i++) {
			for (int j = i + 1; j < books.length; i++) {
				if (books[i].equals(books[j])) {
					duplicateBooks.add(books[i]);
					break;
				}

			}
		}
		return duplicateBooks;
	}

}
