package sort;

/**
 * Created by jinqiuzhi on 16/9/23.
 */
public class HeapSort {
    public static void heapAdjust(int[] array, int heapSize, int index){
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int largest = index;

        if(left < heapSize && array[left] > array[largest]){
            largest = left;
        }
        if(right < heapSize && array[right] > array[largest]){
            largest = right;
        }
        if(index != largest){
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;

            heapAdjust(array, heapSize, largest);
        }

    }

    public static void buildMaxHeap(int[] array){

        for(int i = array.length/2; i >= 0; i--){
            heapAdjust(array, array.length, i);
        }

    }

    public static void heapSort(int[] array){

        buildMaxHeap(array);

        for(int i = array.length - 1; i >= 1; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapAdjust(array, i, 0);
        }
    }

    public static void main(String[] args){
        int[] a = {1,2,5,9,7,8,6,4};
        heapSort(a);
        for(int n = 0; n < a.length; n++){
            System.out.print(a[n] + " ");
        }

    }
}
