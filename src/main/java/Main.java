
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        Scanner scanner=new Scanner(System.in);
        String in = scanner.nextLine();
        String[] a = in.split(",");
        int[] b = new int[a.length];
        int i;
        for(i = 0; i<a.length; i++){
            b[i] = Integer.parseInt(a[i]);
            if(b[i] < 0){
                break;
            }
        }

        if(i < a.length){
            System.out.print(-1);
        }else {

            System.out.println(max(b) - min(b));

        }




    }

    public static int max(int[] A){
         int max = A[1];

        for(int i=0;i<A.length;i++)
        {

            if(A[i]>max)   // 判断最大值
                max=A[i];

        }
        return max;

    }

    public static int min(int[] A){
        int min = A[1];

        for(int i=0;i<A.length;i++)
        {

            if(A[i]<min)   // 判断最小值
                min=A[i];

        }
        return min;

    }








}