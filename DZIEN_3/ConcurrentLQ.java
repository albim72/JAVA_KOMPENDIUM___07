import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedQueue <Integer> clq = new ConcurrentLinkedQueue<>();
        clq.add(13);
        clq.add(456);
        clq.add(2);
        clq.add(67);
        clq.add(126);
        System.out.println("kolejka clq: " + clq);
        ConcurrentLinkedQueue<Integer> clq1 = new ConcurrentLinkedQueue<>(clq);
        System.out.println("kolejka clq1: " + clq1);

        System.out.println("Head element: " + clq.peek());
        System.out.println("kolejka clq: " + clq);
        System.out.println("Head element: " + clq.poll());
        System.out.println("kolejka clq: " + clq);
        System.out.println("rozmiar clq: " + clq.size());

        boolean res = clq.addAll(clq1);
        System.out.println("Dodano kolekcję: " + res);

        System.out.println("kolejka clq: " + clq);
        System.out.println("rozmiar clq: " + clq.size());

    }
}
