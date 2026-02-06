

import org.junit.jupiter.api.Test;
import s26.cs146.hw1mergesort.MergeSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    @Test
    public void testMergeSorted_basic() {
        int[] arr1 = {1, 2, 5, 6, 9};
        int[] arr2 = {3, 4, 7, 8, 10};

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actual = MergeSort.mergeSorted(arr1, arr2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSorted_emptySecondArray() {
        int[] arr1 = {1, 2, 5, 6, 9};
        int[] arr2 = {};

        int[] expected = {1, 2, 5, 6, 9};
        assertArrayEquals(expected, MergeSort.mergeSorted(arr1, arr2));
    }

    @Test
    public void testMergeSorted_duplicates() {
        int[] arr1 = {1, 2, 2, 6};
        int[] arr2 = {1, 2, 5, 7};

        int[] expected = {1, 1, 2, 2, 2, 5, 6, 7};
        assertArrayEquals(expected, MergeSort.mergeSorted(arr1, arr2));
    }

    @Test
    public void testMergeSorted_negativeNumbers() {
        int[] arr1 = {-5, -1, 3};
        int[] arr2 = {-2, 0, 2};

        int[] expected = {-5, -2, -1, 0, 2, 3};
        assertArrayEquals(expected, MergeSort.mergeSorted(arr1, arr2));
    }

    @Test
    public void testMergeSorted_lengthIsCorrect() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4};

        int[] result = MergeSort.mergeSorted(arr1, arr2);
        assertEquals(arr1.length + arr2.length, result.length);
    }
}
