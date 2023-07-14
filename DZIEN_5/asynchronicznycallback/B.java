public class B {
    private OnMarcinEventListener mListener;
    public void registerOnMarcinEventListener(OnMarcinEventListener mListener){
        this.mListener = mListener;
    }
    //zadanie synchroniczne
    public void doMarcinStaff()
    {
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("przygotowanie callback w trakcie zadaniem Asynchronicznego..");
                if(mListener != null){
                    mListener.onMarcinEvent();
                }
            }
        }).start();
       
    }
}
