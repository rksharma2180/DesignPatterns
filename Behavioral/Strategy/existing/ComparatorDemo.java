package Behavioral.Strategy.existing;

import java.util.Arrays;
import java.util.Collections;

public class ComparatorDemo {
    public static void main(String[] args) {
        //Ascending comparator
        ComparatorContext<String> context = new ComparatorContext<>();
        context.setComparator(new ConcreteComparatorAsc<>());
        System.out.println(context.compare("ABC", "XYZ"));

        //Reverse Comparator
        context.setComparator(new ConcreteComparatorRev<>());

        String [] strs = { "z", "a", "p", "b"};

        Arrays.sort(strs, context::compare);

        for(String s: strs){
            System.out.println(s);
        }

    }
}
