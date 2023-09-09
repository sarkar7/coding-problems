package sarkar.java.multithreading;

public class EvenAndOddPrinterByTwoThreads implements Runnable {

    private Object object;
    private static int count = 1;

    public EvenAndOddPrinterByTwoThreads(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (count <= 10) {
            if (count%2!=0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " - " + "Count: " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (count%2==0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " - " + "Count: " + count);
                    count++;
                    object.notify();
                }
            }
        }
    }


    public static void main(String[] args) {
        Object lock = new Object();
        Runnable r1 = new EvenAndOddPrinterByTwoThreads(lock);
        Runnable r2 = new EvenAndOddPrinterByTwoThreads(lock);

        new Thread(r1, "odd").start();
        new Thread(r2, "even").start();

    }
}
