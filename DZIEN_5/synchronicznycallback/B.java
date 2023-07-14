public class B {
    private OnMarcinEventListener mListener;
    public void registerOnMarcinEventListener(OnMarcinEventListener mListener){
        this.mListener = mListener;
    }
    //zadanie synchroniczne
    public void doMarcinStaff()
    {
        System.out.println("przygotowanie callback przed zadaniem synchronicznym...");
        if(this.mListener != null){
            mListener.onMarcinEvent();
        }
    }
}
