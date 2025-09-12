package Behavioral.Strategy.existing;

public class ComparatorContext<T extends Comparable<T>> {

    private StrategyComparator<T> comparator;

    public void setComparator(StrategyComparator<T> comparator){
        this.comparator = comparator;
    }

    public int compare(T o1, T o2){
        return comparator.compare(o1, o2);
    }

}
