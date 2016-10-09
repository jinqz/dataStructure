package threadtest;

/**
 * Created by jinqiuzhi on 16/7/11.
 */
public class ThreadTest {

    public static void main(String[] args){

        MyRunnable myRunnable = new MyRunnable();

        Thread thread0 = new Thread(myRunnable);

        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);


            if(i == 30){
                /*MyThread myThread1 = new MyThread();
                MyThread myThread2 = new MyThread();

                myThread1.start();
                myThread2.start();*/

                thread0.start();
                try {
                    thread0.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
