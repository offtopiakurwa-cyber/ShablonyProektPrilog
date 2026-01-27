package module_01.home_work;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int copies;

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopies() {
        return copies;
    }

    public void incrsCopies(int amount) {
        copies += amount;
    }

    public boolean decrsCopies() {
        if (copies > 0) {
            copies--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return title + " | " + author + " | ISBN: " + isbn + " | Copii: " + copies;
    }
}
