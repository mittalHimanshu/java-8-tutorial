package behaviour_parameterization;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BookFilterTest {

    private List<Book> books;

    @Before
    public void setUp() {
        books = Arrays.asList(
                    new Book("demo 1", "abc", false),
                    new Book("demo 2", "mno", true),
                    new Book("demo 3", "mno", true),
                    new Book("demo 4", "pqr", false),
                    new Book("demo 5", "xyz", true),
                    new Book("demo 6", "mno", false),
                    new Book("demo 7", "abc", false)

                );
    }

    /**
     * contains method filterBooks which shows implementation of
     * lambda expression which overrides test() method of BookTestInterface
     * */
    @Test
    public void filterBooks(){
        new BookFilter().filterBooks(books, (Book book) -> book.getAuthor().equals("pqr"));
    }

    @Test
    public void findAvailableBook() {
        new BookFilter().findAvailableBook(books)
                .forEach(System.out::println);
    }

    @Test
    public void truncateBooks(){
        new BookFilter().truncateBooks(books)
                .forEach(System.out::println);
    }

    @Test
    public void skipBooks() {
        new BookFilter().skipBooks(books)
                .forEach(System.out::println);
    }
}