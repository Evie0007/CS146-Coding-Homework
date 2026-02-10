import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HoarePartitionerTest {

    @Test
    void testSortedArray() {

        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};

        // Run Hoare on the whole array
        int splitIndex = HoarePartitioner.partition(arr, 0, arr.length - 1);

        // Pivot is first element 10 so we choose index 0
        assertEquals(0, splitIndex);

        // Array should be the same
        assertArrayEquals(new int[]{10, 17, 19, 21, 44, 55, 57, 63, 65, 67}, arr);
    }

    @Test
    void testEmptyArray() {

        int[] arr = {};

        // Since it's an empty array with no elements, it will throw
        assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                HoarePartitioner.partition(arr, 0, 0)
        );
    }

    @Test
    void testUnsortedArray() {

        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};

        // Run Hoare on the whole array
        int splitIndex = HoarePartitioner.partition(arr, 0, arr.length - 1);

        assertEquals(6, splitIndex);

        // Expected final array after partition
        assertArrayEquals(new int[]{5, 3, 7, 1, 9, 6, 2, 84}, arr);
    }
}
