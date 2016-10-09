package sort;

/**
 * Created by jinqiuzhi on 16/8/3.
 */
public class StraightInsertionSort extends SortAlgorithm {
    public void sort(int[] a){
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i - 1]){
                int temp = a[i];
                int j;
                for(j = i - 1; j >= 0 && a[j] > temp; j--){
                    a[j + 1] = a[j];
                }
                a[j + 1] = temp;
            }
        }
        super.sort(a);
    }
    public static void main(String[] args){
        int[] a = {3,2,5,9,7,8,6,4,1};
        new StraightInsertionSort().sort(a);

    }
}
