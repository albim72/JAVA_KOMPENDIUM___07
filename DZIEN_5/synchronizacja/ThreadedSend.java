public class ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        this.msg = m;
        this.sender = obj;
    }

    @Override
    public void run() {
        synchronized (sender){
            sender.send(msg);
        }
    }
}
