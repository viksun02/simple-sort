import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        SimpleSelectionSort sorter = new SimpleSelectionSort(list);
        long time = sorter.sort();
        System.out.println("List: "+ sorter.getArray() + " Sorted in " + time + " nanoseconds");
    }
}
