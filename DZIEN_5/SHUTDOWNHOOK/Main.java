
public class Main {
    public static void main(String[] args) {
        Runtime current = Runtime.getRuntime();
        current.addShutdownHook(new TreadChild());

        for(int i=1;i<=10;i++){
            System.out.println("2 x " + i + " = " + 2*i);
        }
    }
}
