package s26.cs146.hw1mergesort;

public class MergeSort {
    public static int[] mergeSorted(int[] arr1, int[] arr2) {
        if (arr1 == null) arr1 = new int[0];
        if (arr2 == null) arr2 = new int[0];

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else  {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) result[k++] = arr1[i++];
        while (j < arr2.length) result[k++] = arr2[j++];

        return result;
    }
}
