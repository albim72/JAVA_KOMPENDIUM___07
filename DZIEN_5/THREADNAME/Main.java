
public class Main {
    public static void main(String[] args) {
        TreadNaming t1 = new TreadNaming("owoc_krajowy");
        TreadNaming t2 = new TreadNaming("owoc_egzotyczny");

        System.out.println("Thread1: " + t1.getName());
        System.out.println("Thread2: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("zielony");
        t2.setName("pomarańczowy");

        System.out.println("Nowa nazwa wątku 1: " + t1.getName());
        System.out.println("Nowa nazwa wątku 2: " + t2.getName());
    }
}
