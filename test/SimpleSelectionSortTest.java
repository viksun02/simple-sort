import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import sort.SimpleSelectionSort;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSelectionSortTest {
    static SimpleSelectionSort sorter;
    static SimpleSelectionSort emptySorter;

    @BeforeAll
    static void setup() {
        List<Integer> testList = new ArrayList<>();
        testList.add(12);
        testList.add(53);
        testList.add(102);
        testList.add(3);
        testList.add(1);
        sorter = new SimpleSelectionSort(testList);
        emptySorter = new SimpleSelectionSort();
    }

    @Test
    void givenAnArray_whenSorting_thenGetSortedArray() {
        sorter.sort();
        List<Integer> actual = sorter.getArray();
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(12);
        expected.add(53);
        expected.add(102);
        assertEquals(expected, actual);
    }
    
    @Test
    void givenNoArray_whenSorting_thenGetEmptyArray() {
        emptySorter.sort();
        assertTrue(emptySorter.getArray().isEmpty());
    }

}