package refactoring_with_lambdas.strategy;

import java.util.Arrays;
import java.util.List;


/**
 * Strategy --> lambda expressions remove the boilerplate code inherent to the strategy design pattern.
 * */
public class Demo {

    private static BookInterface bookInterface = (book) -> book.getAuthor().equals("mno"); // <-- lambda removing boilerplate code

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("demo 1", "abc", false),
                new Book("demo 2", "mno", true),
                new Book("demo 3", "mno", true),
                new Book("demo 4", "pqr", false),
                new Book("demo 5", "xyz", true),
                new Book("demo 6", "mno", false),
                new Book("demo 7", "abc", false)
        );

        for(Book book: books){
            if(bookInterface.test(book)){
                System.out.println(book);
            }
        }

    }


}
