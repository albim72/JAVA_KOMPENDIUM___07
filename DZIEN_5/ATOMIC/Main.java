import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        Thread t1 = new Thread(t,"t1");

        t1.start();
        Thread t2 = new Thread(t,"t2");
        t2.start();

        t1.join();
        t2.join();
        System.out.println("count = " + t.getCount());

        System.out.println("____________________ ATOMIC ___________________________");

        MyAtomicThread k = new MyAtomicThread();
        Thread k1 = new Thread(k,"k1");

        k1.start();
        Thread k2 = new Thread(k,"k2");
        k2.start();

        k1.join();
        k2.join();
        System.out.println("count = " + k.getCount());

    }
}
