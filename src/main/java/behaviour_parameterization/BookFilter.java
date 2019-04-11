package behaviour_parameterization;

import java.util.List;
import java.util.stream.Collectors;

class BookFilter {

    /**
     * @param bookTestInterface Predicate of BookTestInterface interface {@link BookTestInterface#test(Book)}
     * */
    void filterBooks(List<Book> books, BookTestInterface bookTestInterface){
        for(Book book: books){
            if(bookTestInterface.test(book)){
                System.out.println(book.getName());
            }
        }
    }

    /**
     * Filtering with a predicate and method reference example
     * */
    List<Book> findAvailableBook(List<Book> books){
        return books.stream()
                .filter(Book::getIsAvailable)
                .collect(Collectors.toList());
    }

    /**
     * truncating a stream using limit()
     * */
    List<Book> truncateBooks(List<Book> books){
        return books.stream()
                .filter(book -> !book.getIsAvailable())
                .limit(3)
                .collect(Collectors.toList());
    }

    /**
     * skipping elements using skip(n) -> skips first n elements
     * */
    List<Book> skipBooks(List<Book> books){
        return books.stream()
                .skip(2)
                .collect(Collectors.toList());
    }

}