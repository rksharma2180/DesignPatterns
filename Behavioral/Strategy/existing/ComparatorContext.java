package Behavioral.Strategy.existing;

public class ComparatorContext<T extends Comparable<T>> {

    String sortingType = "";
    private StrategyComparator<T> comparator;
    public ComparatorContext(String sortingType){
        this.sortingType = sortingType;
        if (sortingType.equals("ASC")){
            comparator = new ConcreteComparatorAsc<>();
        }
        else if (sortingType.equals("DESC")){
            comparator = new ConcreteComparatorAsc<>();
        }
    }

    public void setComparator(StrategyComparator<T> comparator){
        this.comparator = comparator;
    }

    public int compare(T o1, T o2){
        return comparator.compare(o1, o2);
    }

}
