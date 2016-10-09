package threadtest;

/**
 * Created by jinqiuzhi on 16/7/11.
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}
