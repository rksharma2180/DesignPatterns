package Behavioral.Strategy.existing;

public class ComparatorDemo {
    public static void main(String[] args) {
        //Ascending comparator
        ComparatorContext<String> context = new ComparatorContext<>();
        context.setComparator(new ConcreteComparatorAsc<>());
        System.out.println(context.compare("ABC", "XYZ"));

        //Reverse Comparator
        context.setComparator(new ConcreteComparatorRev<>());
        System.out.println(context.compare("ABC", "XYZ"));
    }
}
