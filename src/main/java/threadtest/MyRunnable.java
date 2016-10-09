package threadtest;

/**
 * Created by jinqiuzhi on 16/7/11.
 */
public class MyRunnable implements Runnable {

    private int i = 0;
    private boolean stop;

    public void run(){
        for(int i = 0; i < 100 && !stop; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public void stopThread(){
        this.stop = true;
    }
}
