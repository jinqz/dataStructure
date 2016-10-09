package threadtest;

import java.util.concurrent.Callable;

/**
 * Created by jinqiuzhi on 16/7/11.
 */
public class MyCallable implements Callable<Integer> {
    private int i = 0;

    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 0; i < 100 ; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum += i;
        }

        return sum;
    }
}
