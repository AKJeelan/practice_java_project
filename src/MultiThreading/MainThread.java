package MultiThreading;

public class MainThread {
    public static void main(String[] args) {

//
//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//
//        thread1.start();
//        thread2.start();
//
//        Thread thread1 = new Thread(new MyRunnable());
//        Thread thread2 = new Thread(new MyRunnable());
//
//        thread1.start();
//        thread2.start();

        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count (with synchronization): " + counter.getCount());
    }
}
