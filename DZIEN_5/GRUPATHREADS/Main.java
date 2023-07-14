
public class Main {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("parent thread group");

        NewThread t1 = new NewThread("one",tg);
        System.out.println("start wątku one");

        NewThread t2 = new NewThread("two",tg);
        System.out.println("start wątku two");

        System.out.println("liczba aktywnych wątków: " + tg.activeCount());
    }
}
