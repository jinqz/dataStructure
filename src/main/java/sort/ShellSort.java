package sort;

/**
 * Created by jinqiuzhi on 16/8/3.
 */
public class ShellSort extends SortAlgorithm {
    public void sort(int[] a){
        for(int d = a.length / 2; d >=1; d = d / 2){
            for(int i = 0; i < d; i++){
                for(int j = i + d; j < a.length; j = j + d){
                    if(a[j] < a[j - d]){
                        int temp = a[j];
                        int k = j - d;
                        while (k >= i && temp < a[k]){
                            a[k + d] = a[k];
                            k = k - d;
                        }
                        a[k + d] = temp;
                    }
                }
            }
        }
        super.sort(a);
    }

    public static void main(String[] args){
        int[] a = {1,2,5,9,7,8,6,4,1};
        new ShellSort().sort(a);
    }

}
