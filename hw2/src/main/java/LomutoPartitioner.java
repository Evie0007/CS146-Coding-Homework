public class LomutoPartitioner {

    public static int partitionLomuto(int[] arr, int low, int high) {
        int pivot = arr[high]; //set the pivot to the last element of the array
        int i = low - 1;       //set pointer i as the boundary between smaller and larger element starting from the left of the array

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) { //compare if the element at j pointer smaller than pivot
                i++;               //increment i

                //swap arr[j] with arr[i]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //if the element at j pointer is larger than pivot
        //then we do nothing and move j to the next element

        //continue until the end of the array
        //when j reach the end, move pivot to the correct position by swaping arr[i+1] with arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
