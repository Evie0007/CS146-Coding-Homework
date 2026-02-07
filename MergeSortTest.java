
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    @Test
    // Test a normal case where both arrays have numbers
    public void testMergeSorted_basic() {
        int[] arr1 = {1, 2, 5, 6, 9};
        int[] arr2 = {3, 4, 7, 8, 10};

        // This is what we expect the merged array to look like
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Run the method
        int[] actual = MergeSort.mergeSorted(arr1, arr2);

        // Check if the result matches what we expected
        assertArrayEquals(expected, actual);
    }

    @Test
    // Test when the second array is empty
    public void testMergeSorted_emptySecondArray() {
        int[] arr1 = {1, 2, 5, 6, 9};
        int[] arr2 = {};

        // If arr2 is empty, the result should just be arr1
        int[] expected = {1, 2, 5, 6, 9};

        // Check the result
        assertArrayEquals(expected, MergeSort.mergeSorted(arr1, arr2));
    }

    @Test
    // Test when both arrays contain duplicate numbers
    public void testMergeSorted_duplicates() {
        int[] arr1 = {1, 2, 2, 6};
        int[] arr2 = {1, 2, 5, 7};

        // The merged result should include all duplicates in sorted order
        int[] expected = {1, 1, 2, 2, 2, 5, 6, 7};

        assertArrayEquals(expected, MergeSort.mergeSorted(arr1, arr2));
    }

    @Test
    // Test when arrays include negative numbers
    public void testMergeSorted_negativeNumbers() {
        int[] arr1 = {-5, -1, 3};
        int[] arr2 = {-2, 0, 2};

        int[] expected = {-5, -2, -1, 0, 2, 3};
        assertArrayEquals(expected, MergeSort.mergeSorted(arr1, arr2));
    }

    @Test
    // Test that the length of the result is correct
    public void testMergeSorted_lengthIsCorrect() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4};

        // Run the method
        int[] result = MergeSort.mergeSorted(arr1, arr2);

        // The result length should equal arr1 length + arr2 length
        assertEquals(arr1.length + arr2.length, result.length);
    }
}