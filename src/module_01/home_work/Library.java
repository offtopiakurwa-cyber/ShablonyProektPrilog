package module_01.home_work;
import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена: " + book);
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Книга с ISBN " + isbn + " удален");
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Читатель зарегистрирован: " + reader);
    }

    public void removeReader(int readerId) {
        readers.removeIf(r -> r.getReaderId() == readerId);
        System.out.println("Читатель с ID " + readerId + " удален");
    }

    public void lendBook(String isbn, int readerId) {
        Book book = findBook(isbn);
        Reader reader = findReader(readerId);

        if (book == null || reader == null) {
            System.out.println("Книга или читатель не найдены.");
            return;
        }

        if (book.decrsCopies()) {
            System.out.println("Книга выпущена " + reader);
        } else {
            System.out.println("Нет доступных копий");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.incrsCopies(1);
            System.out.println("Книга возвращена: " + isbn);
        }
    }

    private Book findBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    private Reader findReader(int id) {
        for (Reader r : readers) {
            if (r.getReaderId() == id) {
                return r;
            }
        }
        return null;
    }
}
