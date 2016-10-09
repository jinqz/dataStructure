package sort;

/**
 * Created by jinqiuzhi on 16/8/3.
 */
public class SimpleSelectionSort extends SortAlgorithm{
    public void sort(int[] a){
        for(int i = 0; i < a.length; i++){
            int min = a[i];
            int minNum = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < min){
                    min = a[j];
                    minNum = j;
                }
            }
            a[minNum] = a[i];
            a[i] = min;

        }
        super.sort(a);
    }
    public static void main(String[] args){
        int[] a = {3,2,5,9,7,8,6,4,1};
        new SimpleSelectionSort().sort(a);
    }
}
