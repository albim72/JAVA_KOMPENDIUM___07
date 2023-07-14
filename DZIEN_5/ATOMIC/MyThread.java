public class MyThread extends Thread{
    private int count;

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(i*100);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getCount() {
        return count;
    }
}
