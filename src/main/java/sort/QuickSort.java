package sort;

/**
 * Created by jinqiuzhi on 16/8/3.
 */
public class QuickSort extends SortAlgorithm{
    public int[] sort(int[] a, int left, int right){

        if (left < right){
            int i = left;
            int j = right;
            int temp = a[left];
            while (i < j){
                while (i < j && a[j] >= temp) {j--;}
                if(i < j) { a[i++] = a[j];}
                while (i < j && a[i] <= temp) {i++;}
                if(i < j) { a[j--] = a[i];}
            }
            a[i] = temp;
            sort(a, left, i - 1);
            sort(a, i + 1, right);
        }
        return a;
    }
    public static void main(String[] args){
        int[] a = {1,2,5,9,7,8,6,4,1};
        int[] b = new QuickSort().sort(a, 0, 8);
        for(int n = 0; n < b.length; n++){
            System.out.print(b[n] + " ");
        }

    }
}
