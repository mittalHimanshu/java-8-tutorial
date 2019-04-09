package behaviour_parameterization;

import java.util.Arrays;
import java.util.List;

public class BookFilter {

    /**
     * Dummy data for books
     * */
    private static List<Book> books = Arrays.asList(
            new Book("demo 1", "abc"),
            new Book("demo 2", "mno"),
            new Book("demo 3", "mno"),
            new Book("demo 4", "pqr")
    );

    /**
     * @param bookTestInterface Predicate of BookTestInterface interface {@link BookTestInterface#test(Book)}
     * */
    private static void filterBooks(BookTestInterface bookTestInterface){
        for(Book book: books){
            if(bookTestInterface.test(book)){
                System.out.println(book.getName());
            }
        }
    }

    /**
     * contains method filterBooks which shows implementation of
     * lambda expression which overrides test() method of BookTestInterface
     * */
    public static void main(String[] args) {
        filterBooks((Book book) -> book.getAuthor().equals("pqr"));
    }
}
