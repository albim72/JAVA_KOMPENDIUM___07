public class NewThread extends Thread{
    NewThread(String threadname,ThreadGroup tgob) {
        super(tgob,threadname);
        start();
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
