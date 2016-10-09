package sort;

/**
 * Created by jinqiuzhi on 16/8/4.
 */
public class MergeSort {
    public int[] sort(int[] a, int low, int high){
        int mid = (low + high)/2;
        if(low < high)
        {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
        return a;
    }
    public int[] merge(int[] a, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int l = low;
        int m = mid + 1;
        int k = 0;
        while (l <= mid && m <= high){
            if(a[l] <= a[m]){
                temp[k++] = a[l++];
            }else{
                temp[k++] = a[m++];
            }
        }
        while (l <= mid){
            temp[k++] = a[l++];
        }
        while (m <= high){
            temp[k++] = a[m++];
        }
        for(int i = 0; i < temp.length; i++){
            a[i + low] = temp[i];
        }
        return a;
    }
    public static void main(String[] args){
        int[] a = {1,2,5,9,7,8,6,4,1};
        int[] b = new MergeSort().sort(a, 0, 8);
        for(int n = 0; n < b.length; n++){
            System.out.print(b[n] + " ");
        }
    }
}
