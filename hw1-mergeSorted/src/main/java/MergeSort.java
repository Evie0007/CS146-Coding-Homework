
public class MergeSort {

    // This method combines two sorted arrays into one sorted array.
    // If one of the arrays is null, it will be treated like an empty array.

    public static int[] mergeSorted(int[] arr1, int[] arr2) {

        // If an array is null, replace it with an empty array so the code doesn't crash
        if (arr1 == null) arr1 = new int[0];
        if (arr2 == null) arr2 = new int[0];

        //This array will hold all numbers from both arrays
        int[] result = new int[arr1.length + arr2.length];

        // i is for arr1, j is for arr2, k is for result
        int i = 0;
        int j = 0;
        int k = 0;


        while (i < arr1.length && j < arr2.length) {
            // Put the smaller number into result, then move forward
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else  {
                result[k++] = arr2[j++];
            }
        }

        // If arr1 still has numbers left, copy them into result
        while (i < arr1.length) result[k++] = arr1[i++];

        // If arr2 still has numbers left, copy them into result
        while (j < arr2.length) result[k++] = arr2[j++];

        // Return the merged sorted array
        return result;
    }
}