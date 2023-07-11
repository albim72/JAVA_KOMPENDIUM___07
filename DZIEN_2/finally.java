
public class Main {

    static void A(){
        try{
            System.out.println("metoda A");
            throw new RuntimeException("metA");
        }finally {
            System.out.println("to już koniec!");
        }
    }

    static void B(){
        try{
            System.out.println("metoda B");
            throw new RuntimeException("metB");
        }finally {
            System.out.println("to już koniec!");
        }
    }
    public static void main(String[] args) {
        try {
            A();
        }catch (Exception e){
            System.out.println("wyjątek A");
        }
        B();
    }
}
