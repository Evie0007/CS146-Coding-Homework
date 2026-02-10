import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LomutoPartitionerTest {

    @Test
    void testSortedArray() {

        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};

        // Run Lomuto on the whole array
        int pivotIndex = LomutoPartitioner.partitionLomuto(arr, 0, arr.length - 1);

        // Pivot is last element so it would stay at index 9
        assertEquals(9, pivotIndex);

        // Array should be the same
        assertArrayEquals(new int[]{10, 17, 19, 21, 44, 55, 57, 63, 65, 67}, arr);
    }

    @Test
    void testEmptyArray() {

        int[] arr = {};

        // Since it's an empty array with no elements, it will throw
        assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                LomutoPartitioner.partitionLomuto(arr, 0, 0)
        );
    }

    @Test
    void testUnsortedArray() {

        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};

        // Run Lomuto on the whole array
        int pivotIndex = LomutoPartitioner.partitionLomuto(arr, 0, arr.length - 1);

        assertEquals(3, pivotIndex);

        // Expected final array after partition
        assertArrayEquals(new int[]{3, 1, 2, 5, 9, 6, 7, 84}, arr);
    }
}
