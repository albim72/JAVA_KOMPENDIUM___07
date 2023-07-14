import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicThread extends Thread {
    private AtomicInteger acount = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(i * 100);
                acount.incrementAndGet();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public AtomicInteger getCount() {
        return acount;
    }
}
