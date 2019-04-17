package spliteartor;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class BasicSplitIterator {

    public static void main(String[] args) {

        // Create an array list for doubles.
        ArrayList<Integer> al = new ArrayList<>();

        // Add values to the array list.
        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(-4);
        al.add(5);

        // Obtain a Stream to the array list.
        Stream<Integer> str = al.stream();

        // getting Spliterator object on al
        Spliterator<Integer> splitr1 = str.spliterator();

        /**
         * estimateSize --> returns an estimate of the number of elements that would be encountered by a forEachRemaining() traversal
         * */
        System.out.println("estimate size : " + splitr1.estimateSize());

        /**
         * getExactSizeIfKnown() --> returns estimateSize() if this spliterator is SIZED, else -1.
         * */
        System.out.println("exact size : " + splitr1.getExactSizeIfKnown());

        /**
         * characteristics() --> returns the list of characteristics of the spliterator.
         *                     It can be any of ORDERED, DISTINCT, SORTED, SIZED, NONNULL, IMMUTABLE, CONCURRENT, and SUBSIZED.
         *
         * hasCharacteristics(int characteristics) --> returns true if the spliterator’s characteristics()
         *                                             contain all of the given characteristics.
         * */
        System.out.println(splitr1.hasCharacteristics(splitr1.characteristics()));

        /**
         * forEachRemaining(Consumer action) --> performs the given action for each remaining element, sequentially in the current thread
         * */
        splitr1.forEachRemaining(System.out::println);

        // Obtaining another  Stream to the array list.
        Stream<Integer> str1 = al.stream();
        splitr1 = str1.spliterator();

        /**
         * trySplit() --> split the elements to two groups and iterate independently.
         * */
        Spliterator<Integer> splitr2 = splitr1.trySplit();

        if(splitr2 != null) {
            System.out.println("Output from splitr2: ");
            splitr2.forEachRemaining(System.out::println);
        }
        
        System.out.println("Output from splitr1: ");
        splitr1.forEachRemaining(System.out::println);

    }

}
