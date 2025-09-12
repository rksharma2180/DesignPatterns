package Behavioral.Strategy.existing;

public class ConcreteComparatorAsc<T extends Comparable<T>> implements StrategyComparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
