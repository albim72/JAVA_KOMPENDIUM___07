public class TreadNaming extends Thread{
    TreadNaming(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Wątek został uruchomiony....");
    }
}
