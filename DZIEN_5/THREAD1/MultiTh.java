public class MultiTh extends Thread {

    public MultiTh() {
    }

    @Override
    public void run() {
        try {
            System.out.println("Wątek " + String.valueOf(Thread.currentThread()) + " pracuje!");
        }catch(Exception var2){
            System.out.printf("problem z analizą wątków");
        }
    }
}
