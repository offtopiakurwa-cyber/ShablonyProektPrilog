package module_01.home_work;

public class Test {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("ADP", "Yerazamat Temirkhan", "111", 2);
        Book book2 = new Book("Base Java", "Erza d4rise", "222", 1);

        library.addBook(book1);
        library.addBook(book2);

        Reader reader1 = new Reader("Yerza", 1);
        Reader reader2 = new Reader("Howlenemy", 2);

        library.registerReader(reader1);
        library.registerReader(reader2);

        library.lendBook("111", 1);
        library.lendBook("111", 2);
        library.lendBook("111", 2);

        library.returnBook("111");
        library.lendBook("111", 2);

        library.removeBook("222");
        library.removeReader(1);
    }
}
