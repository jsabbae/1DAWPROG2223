package UTD5.Tarea54;

public class BookRegistry {
    import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



    public class BookRegistry {



        private final List<Book> books;



        public BookRegistry() {

            this.books = new ArrayList<>();

        }



        public void addBook(String title, String author, LocalDate publicationDate) {

            Book newBook = new Book(title, author, publicationDate);

            books.add(newBook);

            System.out.println("New book added to registry: " + newBook);

        }



        public List<Book> searchByTitle(String title) {

            List<Book> matchingBooks = new ArrayList<>();

            for (Book book : books) {

                if (book.getTitle().equals(title)) {

                    matchingBooks.add(book);

                }

            }

            return matchingBooks;

        }



        public static void main(String[] args) {

            BookRegistry registry = new BookRegistry();



            registry.addBook("The Hobbit", "J.R.R. Tolkien", LocalDate.of(1937, 9, 21));

            registry.addBook("The Lord of the Rings", "J.R.R. Tolkien", LocalDate.of(1954, 7, 29));

            registry.addBook("The Silmarillion", "J.R.R. Tolkien", LocalDate.of(1977, 9, 15));

            registry.addBook("Harry Potter and the Philosopher's Stone", "J.K. Rowling", LocalDate.of(1997, 6, 26));

            registry.addBook("Harry Potter and the Chamber of Secrets", "J.K. Rowling", LocalDate.of(1998, 7, 2));

            registry.addBook("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", LocalDate.of(1999, 7, 8));



            List<Book> matchingBooks = registry.searchByTitle("Harry Potter and the Philosopher's Stone");

            System.out.println("Matching books:");
            // Lo siguiente es hacer un bucle
            for (Book book : matchingBooks) {

                System.out.println(book);

            }

        }



    }
}
