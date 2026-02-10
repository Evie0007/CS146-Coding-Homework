public class HoarePartitioner {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; //make the first element as "pivot" element
        int i = low - 1;      //i start from outside the left boundary
        int j = high + 1;     //j start from outside the right boundary

        while (true) {
            do {i++;}  //incrementing i
            while (arr[i] < pivot); //until find the element >= pivot element

            do {j--;}  //decrementing j
            while (arr[j] > pivot); //until find the element <= pivot element

            //if 2 pointers crossed, j is the split index
            if (i >= j) return j;

            //swap arr[i] and arr[j] to the correct position
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;;
        }
    }
}
