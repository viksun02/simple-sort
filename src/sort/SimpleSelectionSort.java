package sort;

import java.util.ArrayList;
import java.util.List;

public class SimpleSelectionSort {

    private List<Integer> array;

    public SimpleSelectionSort() {
        this.array = new ArrayList<>();
    }

    public SimpleSelectionSort(List<Integer> array) {
        this.array = array;
    }

    private void swap(int first, int second) {
        int temp = array.get(first);
        array.set(first, array.get(second));
        array.set(second, temp);
    }

    public long sort() {
        long startTime = System.nanoTime();

        int minIndex;
        for (int i = 0; i < array.size(); i++) {
            minIndex = i;

            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(i, minIndex);
            }
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public List<Integer> getArray() {
        return this.array;
    }

}
