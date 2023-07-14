
public class Main {
    public static void main(String[] args) {
        Sender send = new Sender();
        ThreadedSend s1 = new ThreadedSend(" Witaj ",send);
        ThreadedSend s2 = new ThreadedSend(" Żegnaj ",send);
        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
