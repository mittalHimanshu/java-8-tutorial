package behaviour_parameterization;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
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

    /* ========== Filter =========== */

    /**
     * Filtering with a predicate and method reference example
     * */
    List<Book> findAvailableBook(List<Book> books){
        return books.stream()
                .filter(Book::getIsAvailable)
                .collect(Collectors.toList());
    }

    /* ======== Slicing / Reducing ======= */

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

    /* ======= Mapping ======= */

    /**
     * Mapping
     * */
    List<String> mapBooks(List<Book> books){
        return books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toList());

    }

    /**
     * Flat Map
     **/
    List<String> flattenStream(List<String> words){
        return words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    /* ======== Matching ========= */

    /**
     * A predicate is passed as parameter in below three functions
     *  allMatch() -> If each element satisfy the given condition
     *  anyMatch() -> If any element matches the given condition
     *  noneMatch() -> If none element matches the given condition, it return true
     * */
    void matchStream(List<Book> books){
        Predicate<Book> p1 = Book::getIsAvailable;
        System.out.println(books.stream().allMatch(p1));
        System.out.println(books.stream().anyMatch(p1));
        System.out.println(books.stream().noneMatch(p1));
    }


}
