
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        OnMarcinEventListener mListener = new A();
        obj.registerOnMarcinEventListener(mListener);
        obj.doMarcinStaff();
    }
}

class A implements OnMarcinEventListener {

    @Override
    public void onMarcinEvent() {
        System.out.println("przygotowanie callback powykonaniu zadania synchronicznego..");
    }
}
