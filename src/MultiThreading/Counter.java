package MultiThreading;

public class Counter {

    private int count = 0;
    private final Object lock = new Object();

    public  void increment() {

        synchronized (this){
            count++;
        }

    }

    public int getCount() {
        return count;
    }
}
