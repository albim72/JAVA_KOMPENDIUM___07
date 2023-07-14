public class TreadChild extends Thread{
    @Override
    public void run() {
        System.out.println("czyszczenie kodu");
        System.out.println("shutdown hook!");
    }
}
