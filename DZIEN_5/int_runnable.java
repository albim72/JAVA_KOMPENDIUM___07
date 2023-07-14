
public class Main implements Runnable{
    public static void main(String[] args) {
        Main obj = new Main();
        Thread mojWatek = new Thread(obj);
        mojWatek.start();

        System.out.println("Wątek główny: " + Thread.currentThread().getName());
        Thread drugi = new Thread(new Main().new RunnExtra());
    }

    private class RunnExtra implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " -> wykonanie metody run()!");
        }
    }

    @Override
    public void run() {
        System.out.println("Wątek utworzony z użyciem interfejsu Runnable");
    }
}
