public class Strategy {
    public static void main(String[] args) {

    }
}

interface SortStrategy {
    void sort(int[] arr);
}

class MergeSortStrategy implements SortStrategy {
    public void sort(int[] arr) {
        System.out.println("Merge Sort");
    }
}
class QuickSortStrategy implements SortStrategy {
    public void sort(int[] arr) {
        System.out.println("Quick Sort");
    }
}
class InsertionSortStrategy implements SortStrategy {
    public void sort(int[] arr) {
        System.out.println("Insertion Sort");
    }
}

class SomeCollection{
    int[] arr;
    SortStrategy sortStrategy;

    SomeCollection(int[] arr, SortStrategy sortStrategy) {
        this.arr = arr;
        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        sortStrategy.sort(arr);
    }

    @Override
    public String toString() {
        return "koko";
    }
}